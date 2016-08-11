package com.extra.email;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;

public class SendMailSSL {
    public static void main(String[] args) {
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class",
                "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");

        Session session = Session.getDefaultInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication("muku3011", "lalita_3011");
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

            System.out.println("Done");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
}