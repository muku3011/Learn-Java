package com.extra.email_sms.email;

import com.extra.email_sms.EmailSmsData;
import com.extra.email_sms.EmailSmsUtilClass;
import com.extra.email_sms.MailType;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;

public class SendMailGmailTLS {

    public static void main(String[] args) {

        Session session = Session.getInstance(EmailSmsUtilClass.getProperties(MailType.GMAIL_TLS),
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(EmailSmsUtilClass.getEmailCredential("username"), EmailSmsUtilClass.getEmailCredential("password"));
                    }
                });
        EmailSmsData emailSmsData = new EmailSmsData();
        emailSmsData.setMailFrom("muku3011@gmail.com");
        emailSmsData.setMailTo("joshi2401@gmail.com");
        emailSmsData.setMailSubject("Welcome test mail");
        emailSmsData.setMailBody("Body of welcome mail");
        try {
            Message message = EmailSmsUtilClass.getPreparedMessage(emailSmsData, session);
            Transport.send(message);
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
}