package com.extra.email;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


public class EmailSmsUtilClass {

    public static Message getPreparedMessage(EmailSmsData emailSmsData, Session session) throws MessagingException {

        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress(emailSmsData.getMailFrom()));
        message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(emailSmsData.getMailTo()));
        message.setSubject(emailSmsData.getMailSubject());
        message.setText(emailSmsData.getMailBody());
        return message;
    }

}
