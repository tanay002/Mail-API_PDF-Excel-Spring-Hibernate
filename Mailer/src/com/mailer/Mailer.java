package com.mailer;

import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Mailer 
{
	public void demo()
	{
		final String SSL_FACTORY = "javax.net.ssl.SSLSocketFactory";
		Properties props = System.getProperties();
		props.setProperty("mail.smtp.host", "smtp.gmail.com");
		props.setProperty("mail.smtp.socketFactory.class", SSL_FACTORY);
		props.setProperty("mail.smtp.socketFactory.fallback", "false");
		props.setProperty("mail.smtp.port", "465");
		props.setProperty("mail.smtp.socketFactory.port", "465");
		props.put("mail.smtp.auth", "true");
		props.put("mail.debug", "true");
		props.put("mail.store.protocol", "pop3");
		props.put("mail.transport.protocol", "smtp");
		final String username = "cafeapna1@gmail.com";//
		final String password = "rahulgandhi007008009";
		try{
			Session session = Session.getDefaultInstance(props,
					new Authenticator(){
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(username, password);
				}});

			// -- Create a new message --
			Message msg = new MimeMessage(session);

			// -- Set the FROM and TO fields --
			msg.setFrom(new InternetAddress("cafeapna1@gmail.com"));
			msg.setRecipients(Message.RecipientType.TO,
					InternetAddress.parse("tanay.saxena002@gmail.com",false));


			msg.setSubject("Hello");
			msg.setText("How are you update");
			msg.setSentDate(new Date());
			Transport.send(msg);
			System.out.println("Message sent.");
		}catch (MessagingException e){ System.out.println("Erreur d'envoi, cause: " + e);}
	}
	public static void main(String[] args) {
		Mailer m=new Mailer();
		m.demo();
	}
}
