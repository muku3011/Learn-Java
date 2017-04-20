package com.projects.email_sms.email;

import com.projects.email_sms.EmailSmsData;
import com.projects.email_sms.EmailSmsUtilClass;
import com.projects.email_sms.MailType;

import javax.mail.*;

public class SendMailLiveTLS {

    public static void main(String[] args) {

        Session session = Session.getInstance(EmailSmsUtilClass.getProperties(MailType.LIVE), new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(EmailSmsUtilClass.getEmailCredential("username"), EmailSmsUtilClass.getEmailCredential("password"));
            }
        });

        EmailSmsData emailSmsData = new EmailSmsData();
        emailSmsData.setMailFrom("muku3011@live.com");
        emailSmsData.setMailTo("mukesh.bciit@gmail.com");
        emailSmsData.setMailSubject("Welcome test mail");
        emailSmsData.setMailBody("Body of welcome mail");
        try {
            Message message = EmailSmsUtilClass.getPreparedMessage(emailSmsData, session);
            Transport.send(message);
            System.out.println("Done !!");
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}
