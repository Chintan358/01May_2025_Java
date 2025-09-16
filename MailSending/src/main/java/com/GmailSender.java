package com;

import java.util.Properties;

import jakarta.mail.Authenticator;
import jakarta.mail.Message;
import jakarta.mail.MessagingException;
import jakarta.mail.PasswordAuthentication;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;


public class GmailSender {
	
    public static String sendmail(String toEmail,String subject, String message) {
        // Sender Gmail credentials
        final String fromEmail = "chintan.tops@gmail.com";
        final String password = "vcqg jozm qtwm alfc"; // Use App Password, not Gmail password

        // Receiver Email
       
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com"); // SMTP Host
        props.put("mail.smtp.port", "587");            // TLS Port
        props.put("mail.smtp.auth", "true");           // Enable Authentication
        props.put("mail.smtp.starttls.enable", "true"); // Enable STARTTLS

        // Authenticator
        Authenticator auth = new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(fromEmail, password);
            }
        };

        // Session
        Session session = Session.getInstance(props, auth);

        try {
            // Create Email
            MimeMessage msg = new MimeMessage(session);

            msg.setFrom(new InternetAddress(fromEmail));
            msg.addRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
            msg.setSubject(subject);
            msg.setText(message);

            // Send Email
            Transport.send(msg);

            return "✅ Email sent successfully!";
        } catch (MessagingException e) {
            e.printStackTrace();
        }
        
        return null;
    }
}
