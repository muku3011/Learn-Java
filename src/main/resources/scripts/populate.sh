#!/bin/bash

EmptyContentSTMChannels=

# To fetch all STM channels whose content is not updated.
function getEmptyContentSTMChannels()
{
EmptyContentSTMChannels=`
SQLPLUS="$ORACLE_HOME/bin/sqlplus -s $DBUSER/$DBUSERPWD"
$SQLPLUS << EOF_SQL_1
        set feedback off
        set heading off;
        set serverout off;
        set underline off
        set verify off;
        SELECT CHANNEL_ID FROM ADWISE_CHANNEL WHERE TYPE='STMI' AND CHANNEL_ID NOT IN (SELECT CHANNEL_ID FROM ADWISE_CH_CONTENT_STM);
        exit;
EOF_SQL_1`
}

# Insert and Update STM channel content
function updateChannelAndContent()
{
SQLPLUS="$ORACLE_HOME/bin/sqlplus -s $DBUSER/$DBUSERPWD"
$SQLPLUS << EOF_SQL_1
        set feedback off
        set heading off;
        set serverout off;
        set underline off
        set verify off;
		INSERT INTO ADWISE_CONTENT_STM VALUES (ADWISE_SEQUENCE.nextval, null);
		INSERT INTO ADWISE_CH_CONTENT_STM VALUES (ADWISE_SEQUENCE.currval, $1);
		commit;
        exit;
EOF_SQL_1
}

# Create content for each empty STM Channel
function createContentForSTMChannel
{
for channelId in $EmptyContentSTMChannels; do

	printf "Content populated for STM channel Id : [$channelId] \n"

	#Add entry in STM Channel content tables
	updateChannelAndContent $channelId

done
}

#Get list of STM channels with empty content
getEmptyContentSTMChannels

#Populate empty content tables
createContentForSTMChannel