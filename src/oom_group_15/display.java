package oom_group_15;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class display {
	display(){
	JFrame f4=new JFrame("LOGIN PAGE");
        JTextField t7=new JTextField("",45);
        JPasswordField t8=new JPasswordField("",30);
        JLabel l8=new JLabel("ENTER EMAIL ID");
        JLabel l100=new JLabel(" ");
        JLabel l9=new JLabel("ENTER PASSWORD");
        JButton b5=new JButton("LOGIN");
        Font font3=new Font("Verdana",Font.BOLD,18);
        f4.setSize(900,700);
        l8.setBounds(50,150,200,70);
        t7.setBounds(350,150,470,60);
        l100.setBounds(50,400,300,70);
        l9.setBounds(50,250,200,70);
        t8.setBounds(350,250,470,70);
        b5.setBounds(515,400,300,60);
        l8.setFont(font3);
        t7.setFont(font3);
        l100.setForeground(Color.red);
        l9.setFont(font3);
        t8.setFont(font3);
        b5.setFont(font3);
        f4.add(l9);
        f4.add(l100);
        f4.add(l8);
        f4.add(t7);
        f4.add(t8);
        f4.add(b5);
        f4.setLayout(null);
        f4.setVisible(true);
       
   
        b5.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e4)
           {
        	   String emailid=t7.getText().toString();
        	   new login(t7.getText(),t8.getText());
	            if(login.main(new String[0])==1) {
	            	f4.setVisible(false);
            	    JFrame f5=new JFrame("PERMISSION STATUS");
                    JLabel b6=new JLabel(" ");
                    Font font4=new Font("Verdana",Font.BOLD,16);
                    f5.setSize(900,700);
                    b6.setBounds(250,200,500,70);
                    b6.setFont(font4);
                    f5.add(b6);
                    JButton jb = new JButton("I want to enter");
                    jb.setBounds(250,350,300,60);
                    jb.setFont(font4);
                    f5.add(jb);
                    JButton jb2 = new JButton("I want to leave");
                    jb2.setBounds(250,450,300,60);
                    jb2.setFont(font4);
                    f5.add(jb2);
                    f5.setLayout(null);
                    f5.setVisible(true);
                   
                   jb.addActionListener(new ActionListener(){
    		            public void actionPerformed(ActionEvent e4)
    		            {
    		            	new do_timings_check(emailid);
    		            	if(do_timings_check.main(new String[0])==1) {
    		            		new do_access_change(1,emailid);
	    		            	b6.setText("Access granted, You can enter");
	    		            	jb.setVisible(false);
	    		            	JButton b20=new JButton ("Okay");
	                            b20.setBounds(250,450,300,60);
	                            b20.setFont(font4);
	                            f5.add(b20);
	                            b20.addActionListener(new ActionListener(){
	                            	
	                                public void actionPerformed(ActionEvent e14)
	                                {
	                                	f5.setVisible(false);
	                                }
	                            });
    		            	}else {
    		            		b6.setText("Yoy have no access now");
	    		            	jb.setVisible(false);
	    		            	jb2.setVisible(false);
	    		            	JButton b20=new JButton ("Okay");
	                            b20.setBounds(1000,580,250,70);
	                            b20.setFont(font4);
	                            f5.add(b20);
	                            b20.addActionListener(new ActionListener(){
	                            	
	                                public void actionPerformed(ActionEvent e14)
	                                {
	                                	f5.setVisible(false);
	                                }
	                            });
    		            	}
    		            }
    		        });
                   jb2.addActionListener(new ActionListener(){
   		            public void actionPerformed(ActionEvent e4)
   		            {
   		            	new do_access_change(0,emailid);
   		            	b6.setText("State saved, you can leave");
   		            	jb2.setVisible(false);
   		            	JButton b20=new JButton ("Okay");
                        b20.setBounds(1000,580,250,70);
                        b20.setFont(font4);
                        f5.add(b20);
                        b20.addActionListener(new ActionListener(){
                        	
                            public void actionPerformed(ActionEvent e14)
                            {
                            	f5.setVisible(false);
                            }
                        });
   		            }
   		        });
               }else {
            	   l100.setText("** entered email_id or password is wrong **");
               }
               
           }
       });
	}
}

