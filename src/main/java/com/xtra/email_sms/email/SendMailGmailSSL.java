package com.xtra.email_sms.email;

import com.xtra.email_sms.EmailSmsData;
import com.xtra.email_sms.EmailSmsUtilClass;
import com.xtra.email_sms.MailType;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;

public class SendMailGmailSSL {
    public static void main(String[] args) {

        Session session = Session.getDefaultInstance(EmailSmsUtilClass.getProperties(MailType.GMAIL_SSL),
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(EmailSmsUtilClass.getEmailCredential("username"), EmailSmsUtilClass.getEmailCredential("password"));
                    }
                });

        try {
            EmailSmsData emailSmsData = new EmailSmsData();
            emailSmsData.setMailFrom("muku3011@gmail.com");
            emailSmsData.setMailTo("mukesh.bciit@gmail.com");
            emailSmsData.setMailSubject("Welcome test mail");
            emailSmsData.setMailBody("Body of welcome mail");

            Message message = EmailSmsUtilClass.getPreparedMessage(emailSmsData, session);
            Transport.send(message);
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
}