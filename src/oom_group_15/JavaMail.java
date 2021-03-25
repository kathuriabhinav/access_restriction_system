package oom_group_15;

import javax.mail.*;
import javax.mail.internet.*;
import java.util.*;
import java.util.logging.Logger;
import java.util.logging.Level;


class JavaMailUtil {

public static void sendMail(String recepient,String name,String mode) throws Exception
{
    System.out.println("executing java_mail class to send email");
    Properties props=new Properties();
    props.put("mail.smtp.starttls.enable","true");
    props.put("mail.smtp.auth","true");
    props.put("mail.smtp.host","smtp.gmail.com");
    props.put("mail.smtp.port","587");
    String myAccountEmail="access.restricted.system@gmail.com";
    String password="oomoomoom";
    Session session = Session.getInstance(props,new Authenticator()
    {
        protected PasswordAuthentication getPasswordAuthentication()
        {
            return new PasswordAuthentication(myAccountEmail,password);
        }
    });
    Message message=prepareMessage(session,myAccountEmail,recepient,name,mode);
    Transport.send(message);
}
private static Message prepareMessage(Session session,String myAccountEmail,String recepient,String name,String mode){
    try
    {
    Message message= new MimeMessage(session);
    message.setFrom(new InternetAddress(myAccountEmail));
    message.setRecipient(Message.RecipientType.TO,new InternetAddress(recepient));
    message.setText("Dear "+name+",\nThank you for getting in touch!, Your registration was successfull.\r\n" + 
    		"We appreciate you on registering into our automatic access restricted system group project.\n\r"+
    		"As per the details entered by you while registration, you have access to enter on "+ mode + "\r\n" +
    		"\r\n" + 
    		"This project is created by\r\n" + 
    		"IIT2019135 - Kathuri Abhinav,\r\n" + 
    		"IIT2019172 - Nossam Venkata Vasanth Reddy,\r\n" +
    		"IIT2019108 - Ramavath Jayaram Naik,\r\n" + 
    		"IIT2019106 - Madasi Harsha Vardhan,\r\n" + 
    		"from IIIT Allahabad.\r\n\n" +
    		"Thanking you for your time, Have a great day ahead!");
    message.setSubject("Registration Successfull");
    return  message;
}catch (Exception ex)
 {
    Logger.getLogger(JavaMailUtil.class.getName()).log(Level.SEVERE,null,ex);
    }
    return null;
}
}

public class JavaMail
{
	static String emailid;
	static String name;
	static String mode;
	public JavaMail(String e, String n, int m) {
		// TODO Auto-generated constructor stub
		emailid=e;
		name=n;
		if(m==1) {
			mode="-- all days and at all time.";
		}
		else if(m==2) {
			mode="-- all days with the timings -- from 8 am to 10 pm only.";
		}else if(m==3) {
			mode="-- monday to friday with the timings -- from 8 am to 10 pm only.";
		}
	}
	public static void main(String[] Args) throws Exception {
		JavaMailUtil.sendMail(emailid,name,mode);
                System.out.println("email sent successfully to "+ emailid);
	}
}

            