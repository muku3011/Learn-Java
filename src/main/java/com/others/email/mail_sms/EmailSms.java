package com.others.email.mail_sms;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.URLName;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class EmailSms {
	
/*	private static final String HOST_GMAIL = "74.125.130.109";
	private static final String USER_NAME_GMAIL = "muku3011@gmail.com";
	private static final String USER_PASSWORD_GMAIL = "lalita_3011";
	private static final int PORT_GMAIL = 465;*/

	private static final String HOST_LIVE = "65.55.176.126";
	private static final String USER_NAME_LIVE = "muku3011@live.com";
	private static final String USER_PASSWORD_LIVE = "rinki_3011";
	private static final int PORT_LIVE = 587;
	
	private static final String PROTOCOL = "smtp";
	
	public void sendMail(String from, String to, String mailSubject, String mailMessage) throws AddressException, MessagingException {

		Properties properties = new Properties();
		properties.put("mail.smtp.host", HOST_LIVE);
		properties.put("mail.smtp.starttls.enable", "true");
		properties.put("mail.smtp.port", PORT_LIVE);
		properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.user", USER_NAME_LIVE);
        properties.put("mail.smtp.password", USER_PASSWORD_LIVE);
        
		Session session = Session.getInstance(properties, new Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(USER_NAME_LIVE, USER_PASSWORD_LIVE);
			}
		});

		session.setPasswordAuthentication(new URLName(PROTOCOL, HOST_LIVE, PORT_LIVE, null, USER_NAME_LIVE, USER_PASSWORD_LIVE), new PasswordAuthentication(USER_NAME_LIVE, USER_PASSWORD_LIVE));

		Message message = new MimeMessage(session);
		message.setFrom(new InternetAddress(from));
		message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
		message.setSubject(mailSubject);
		message.setText(mailMessage);

		// Send message with authentication!
		Transport transport = session.getTransport(PROTOCOL);
		
		transport.connect(HOST_LIVE, USER_NAME_LIVE, USER_PASSWORD_LIVE);
		message.saveChanges(); // don't forget this
		transport.sendMessage(message, message.getAllRecipients());
		transport.close();
	}
	
	public void sendMessage(String userMessage, String userNumber, String pwd, String uid, String userName, String sendTo) throws UnsupportedEncodingException, UnirestException
	{
		//Reference https://www.mashape.com/blaazetech/site2sms
		StringBuilder url = new StringBuilder();
		
		//API fix URL
		url.append("https://site2sms.p.mashape.com/index.php?msg=");
		//API message for SMS (encoded)
		url.append(createEncodedMessage(userName, userNumber, userMessage));
		
		//API phone number to which SMS should be sent
		url.append("&phone=");
		url.append(sendTo);
		//API password
		url.append("&pwd=");
		url.append(pwd);
		//API userID
		url.append("&uid=");
		url.append(uid);
		
		System.out.println("URL : "+url.toString());	
		HttpResponse<JsonNode> response = null;
		try {
		response = Unirest.get(url.toString())
				.header("X-Mashape-Key", "4OcpD56OJWmshHPJBm7c8L0VTVVep14UITyjsnHnbBmFSzptu1")
				.header("Accept", "application/json").asJson();
		} catch (UnirestException e) {
		    e.printStackTrace();
		}
		System.out.println("STATUS CODE : " + response.getStatus());		
		if (response.getStatus() == 200) {
			System.out.println("Message sent !!!");
		}
	}
	
	private String createEncodedMessage(String userName, String userNumber,	String userMessage) throws UnsupportedEncodingException
	{
		StringBuilder message = new StringBuilder();
		String newLine = System.getProperty("line.separator");
		
		message.append("Query from ");
		message.append(userName.toUpperCase());
		message.append("("+userNumber+") :");
		message.append(newLine);
		
		if(userMessage.length() > 80) {
			System.out.println("Trimming user mesage");
			String newMessage = (String) userMessage.subSequence(0, 77);
			message.append(newMessage);
			message.append("...");
		} else {
			message.append(userMessage);
		}
		String encodedMessage = message.toString();
		encodedMessage = URLEncoder.encode(encodedMessage, "UTF-8");
		
		System.out.println("URL encoded message : "+encodedMessage);
		return encodedMessage;
	}

}