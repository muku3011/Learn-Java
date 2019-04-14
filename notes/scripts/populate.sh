#!/bin/bash

AdminUsers=

# To fetch all users whose content is not updated.
function getAdminUsers()
{
AdminUsers=`
SQLPLUS="$ORACLE_HOME/bin/sqlplus -s $DBUSER/$DBUSERPWD"
$SQLPLUS << EOF_SQL_1
        set feedback off
        set heading off;
        set serverout off;
        set underline off
        set verify off;
        SELECT USER_NAME FROM USER WHERE TYPE='ADMIN' AND USER_ID NOT IN (SELECT USER_ID FROM BLOCKED_USERS);
        exit;
EOF_SQL_1`
}

# Insert and Update user content
function updateUserAndContent()
{
SQLPLUS="$ORACLE_HOME/bin/sqlplus -s $DBUSER/$DBUSERPWD"
$SQLPLUS << EOF_SQL_1
        set feedback off
        set heading off;
        set serverout off;
        set underline off
        set verify off;
		INSERT INTO USER_CONTENT VALUES (USER_SEQUENCE.nextval, null);
		INSERT INTO USER_CONTENT VALUES (USER_SEQUENCE.currval, $1);
		commit;
        exit;
EOF_SQL_1
}

# Create content for each empty user
function createContentForUser
{
for userID in ${AdminUsers}; do

	printf "Content populated for user Id : [userID] \n"

	#Add entry in user content tables
	updateUserAndContent ${userID}

done
}

#Get list of Admin users
getAdminUsers

#Populate content tables
createContentForUser