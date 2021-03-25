package oom_group_15;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class updation {
    updation(){
        
        JFrame f6=new JFrame("LOGIN PAGE");
        JTextField t9=new JTextField("",45);
        JPasswordField t10=new JPasswordField("",30);
        JLabel l8=new JLabel("ENTER EMAIL ID");
        JLabel l100=new JLabel(" ");
        JLabel l9=new JLabel("ENTER PASSWORD");
        JButton b7=new JButton("LOGIN");
        Font font3=new Font("Verdana",Font.BOLD,18);
        f6.setSize(900,700);
        l8.setBounds(50,150,200,70);
        t9.setBounds(350,150,470,60);
        l100.setBounds(50,400,300,70);
        l9.setBounds(50,250,200,70);
        t10.setBounds(350,250,470,70);
        b7.setBounds(515,400,300,60);
        l100.setForeground(Color.red);
        l8.setFont(font3);
        t9.setFont(font3);
        l9.setFont(font3);
        t10.setFont(font3);
        b7.setFont(font3);
        f6.add(l9);
        f6.add(l100);
        f6.add(l8);
        f6.add(t9);
        f6.add(t10);
        f6.add(b7);
        f6.setLayout(null);
        f6.setVisible(true);
        
	     b7.addActionListener( new ActionListener() {
	    	 
	        public void actionPerformed(ActionEvent e1)
	        {
                    String z =t9.getText().toString();
                    new login(t9.getText(),t10.getText());
                    if(login.main(new String[0])==1) {
	            	
	            	f6.setVisible(false);
	            	JFrame f2=new JFrame("UPDATE PAGE");
    	
                        JLabel l6=new JLabel("CONTACT NO.");
                        JTextField t6=new JTextField("");

                        JLabel l6a=new JLabel("PASSWORD");
                        JPasswordField t6a=new JPasswordField("");

                        JLabel l6b=new JLabel("CONFIRM PASSWORD");
                        JLabel l70=new JLabel(" ");
                        JLabel l80=new JLabel(" ");
                        JPasswordField t6b=new JPasswordField("");

                        JLabel l7=new JLabel ("TIMINGS");

                        JRadioButton r4=new JRadioButton("A) ALL DAYS ALL TIME");
                        JRadioButton r5=new JRadioButton("B) ALL DAYS FROM 8 AM to 10 PM");
                        JRadioButton r6=new JRadioButton("C) MON to FRI 8 AM to 10 PM");

                        ButtonGroup g2 = new ButtonGroup();
                        g2.add(r4);
                        g2.add(r5);
                        g2.add(r6);

                        JButton b6=new JButton("UPDATE");

                        Font font2=new  Font("Verdana",Font.BOLD,16);

                        l6.setFont(font2);
                        l6a.setFont(font2);
                        l6b.setFont(font2);
                        t6.setFont(font2);
                        t6a.setFont(font2);
                        t6b.setFont(font2);
                        l7.setFont(font2);
                        r4.setFont(font2);
                        r5.setFont(font2);
                        r6.setFont(font2);
                        b6.setFont(font2);
                        
                        l100.setForeground(Color.red);
                        l80.setForeground(Color.red);
                        l70.setForeground(Color.red);

                        f2.add(l6);
                        f2.add(l6a);
                        f2.add(l6b);
                        f2.add(t6);
                        f2.add(t6a);
                        f2.add(l70);
                        f2.add(l80);
                        f2.add(t6b);
                        f2.add(l7);
                        f2.add(r4);
                        f2.add(r5);
                        f2.add(r6);
                        f2.add(b6);

                        f2.setSize(900,700);
                        l6.setBounds(50,50,180,60);
                        t6.setBounds(300,50,500,60);

                        l6a.setBounds(50,150,180,60);
                        t6a.setBounds(300,150,470,60);

                        l6b.setBounds(50,250,200,60);
                        t6b.setBounds(300,250,500,60);

                        l7.setBounds(50,350,130,60);
                        l70.setBounds(50,280,400,60);
                        l80.setBounds(50,380,470,60);
                        r4.setBounds(300,350,470,50);
                        r5.setBounds(300,410,470,50);
                        r6.setBounds(300,470,470,50);

                        b6.setBounds(550,550,300,60);

                        f2.setLayout(null);

                        f2.setVisible(true);
		            
		            b6.addActionListener(new ActionListener(){
                                
		            	
			            public void actionPerformed(ActionEvent e4)
			            {
                                        l100.setText(" ");
                                        l70.setText(" ");
                                        l80.setText(" ");
			            	String x =t6a.getText();
			                String y =t6b.getText();
			                
			                
			                if(x.equals(y))
			                {
			                	if(r4.isSelected()) {
			                		
			                		f2.setVisible(false);
			                		new do_update(z,x,t6.getText(),1);
			                		do_update.main(new String[0]);
		                			
                                                        JFrame f5=new JFrame("UPDATION STATUS");
                                                        JLabel b6=new JLabel("Updated Succesfully");
                                                        f5.setSize(500,400);
                                                        JButton b20=new JButton ("Okay");
                                                        b20.setBounds(200, 170, 70, 30);
                                                        f5.add(b20);
                                                        b6.setBounds(170, 120, 200, 30);
                                                        f5.add(b6);
                                                        f5.setLayout(null);
                                                        f5.setVisible(true);
                                                        b20.addActionListener(new ActionListener(){

                                                            public void actionPerformed(ActionEvent e14)
                                                            {
                                                                    f5.setVisible(false);
                                                            }
                                                        });
			                		
			                	}else if(r5.isSelected()) {
			                		
			                		f2.setVisible(false);
			                		new do_update(z,x,t6.getText(),2);
			                		do_update.main(new String[0]);
                                                        JFrame f5=new JFrame("UPDATION STATUS");
                                                        JLabel b6=new JLabel("Updated Succesfully");
                                                        f5.setSize(500,400);
                                                        JButton b20=new JButton ("Okay");
                                                        b20.setBounds(200, 170, 70, 30);
                                                        f5.add(b20);
                                                        b6.setBounds(170, 120, 200, 30);
                                                        f5.add(b6);
                                                        f5.setLayout(null);
                                                        f5.setVisible(true);
                                                        b20.addActionListener(new ActionListener(){

                                                            public void actionPerformed(ActionEvent e14)
                                                            {
                                                                    f5.setVisible(false);
                                                            }
                                                        });
			                		}
			                		
			                	else if(r6.isSelected()) {
			                		
			                		f2.setVisible(false);
			                		new do_update(z,x,t6.getText(),3);
			                		do_update.main(new String[0]);
		                			JFrame f5=new JFrame("UPDATION STATUS");
                                                        JLabel b6=new JLabel("Updated Succesfully");
                                                        f5.setSize(500,400);
                                                        JButton b20=new JButton ("Okay");
                                                        b20.setBounds(200, 170, 70, 30);
                                                        f5.add(b20);
                                                        b6.setBounds(170, 120, 200, 30);
                                                        f5.add(b6);
                                                        f5.setLayout(null);
                                                        f5.setVisible(true);
                                                        b20.addActionListener(new ActionListener(){

                                                            public void actionPerformed(ActionEvent e14)
                                                            {
                                                                    f5.setVisible(false);
                                                            }
                                                        });
		                		}else {
		                			l80.setText("** SELECT ONE TIMINGS **");
			                	}
			                }
			                else
			                {
			                    l70.setText("** ENTER THE SAME PASSWORD **");
			                }
			            }
			        });
	            }else {
	            	l100.setText("** entered email_id or password is wrong **");
	            }
	        }
	    });
	}
}
