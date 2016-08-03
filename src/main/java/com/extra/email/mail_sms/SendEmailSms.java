package com.extra.email.mail_sms;

import java.io.UnsupportedEncodingException;
import javax.mail.MessagingException;
import com.mashape.unirest.http.exceptions.UnirestException;

public class SendEmailSms {
    private static final long serialVersionUID = -864380048013735975L;

    private static final String PANEL_CAPTION = "Send query";
    private static final String USER_NAME_FIELD = "Name : ";

    private static final String USER_PHONE_NUMBER_FIELD = "Mobile number : ";
    private static final String USER_QUERY_MAIL_AREA = "Your mail text : ";
    private static final String USER_QUERY_SMS_AREA = "Your sms text : ";
    private static final String USER_QUERY_SEND_MAIL_BUTTON = "Send mail";
    private static final String USER_QUERY_SEND_SMS_BUTTON = "Send sms";

    private static final int MAX_LENGTH_USER_NAME = 20;
    private static final int MAX_LENGTH_USER_NUMBER = 12;
    private static final int MAX_USER_MAIL_QUERY = 200;
    private static final int MAX_USER_SMS_QUERY = 100;

    private static final String USER_NAME_PROMPT = "Your name";
    private static final String USER_NUMBER_PROMPT = "Mobile number";
    private static final String USER_QUERY_MAIL_PROMPT = "Your mail text";
    private static final String USER_QUERY_SMS_PROMPT = "Your sms text";

    private static final String userNameValidateExpression = "^[\\p{L} .'-]+$";
    private static final String userPhoneNumberValidateExpression = "^[789]\\d{9}$";
/*	^     #Match the beginning of the string
    [789] #Match a 7, 8 or 9
	\d    #Match a digit (0-9 and anything else that is a "digit" in the regex engine)
	{9}   #Repeat the previous "\d" 9 times (9 digits)
	$     #Match the end of the string*/

    private EmailSms sendMail = new EmailSms();
    private UserDetail sendTo = new UserDetail();

    public void setSendTo() {
        sendTo.setMailId("mukesh.bciit@gmail.com");
        sendTo.setNumber("9717888309");
        sendTo.setMailId("ankit31aries@gmail.com");
        sendTo.setNumber("8826800979");
        sendTo.setMailId("saky_arora30@yahoo.in");
        sendTo.setNumber("9711996929");
        sendTo.setMailId("kusumnegi2006@gmail.com");
        sendTo.setNumber("9899874292");
    }


    private boolean sendMail(String userName, String userNumber, String userMessage) {
        String from = "muku3011@live.com";
        String to = sendTo.getMailId();
        System.out.println("Send to : " + sendTo.getMailId());

        String mailSubject = "Query from " + userName + " (" + userNumber + ")";
        String newLine = System.getProperty("line.separator");
        String mailMessage = userMessage + newLine + newLine + newLine + newLine + "Name : " + userName + newLine + "Phone number : " + userNumber;

        try {
            sendMail.sendMail(from, to, mailSubject, mailMessage);
        } catch (MessagingException e) {
            System.out.println("Mail not sent !!!");
            System.out.println();
            e.printStackTrace();
            return false;
        }
        System.out.println("Mail sent !!!");
        return true;
    }

    private boolean sendMessage(String userName, String userNumber, String userMessage) {
        String pwd = "goodtime3011";
        String uid = "9953966221";
        System.out.println("Send to : " + sendTo.getNumber());
        try {
            sendMail.sendMessage(userMessage, userNumber, pwd, uid, userName, sendTo.getNumber());
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            System.out.println("SMS not sent !!!");
            return false;
        } catch (UnirestException e) {
            e.printStackTrace();
            System.out.println("SMS not sent !!!");
            return false;
        }
        System.out.println("SMS sent !!!");
        return true;
    }

}