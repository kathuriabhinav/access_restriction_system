package oom_group_15;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class registration {
registration(){
		
	JFrame f1=new JFrame("REGISTRATION PAGE");
        
	JLabel l1=new JLabel ("NAME *");
        JTextField t1=new JTextField("",45);
        
        JLabel l2=new JLabel ("PASSWORD *");
        JPasswordField t2=new JPasswordField("",13);
        
        JLabel l2b=new JLabel ("CONFIRM PASSWORD *");
        JPasswordField t2b=new JPasswordField("",13);
        
        JLabel l3 = new JLabel ("EMAIL ID *");
        JLabel l = new JLabel(" ");
        JTextField t3=new JTextField("",40);
        
        JLabel l4=new JLabel ("CONTACT NO. *");
        JTextField t4=new JTextField("",10);
        
        JLabel l5=new JLabel ("TIMINGS *");
        JLabel l70=new JLabel(" ");
        JLabel l80=new JLabel(" ");
        
        JButton b4=new JButton ("REGISTER");
        
        Font font=new Font("Verdana",Font.BOLD,16);
        
        
        JRadioButton r1=new JRadioButton("A) ALL DAYS ALL TIME");
        JRadioButton r2=new JRadioButton("B) ALL DAYS FROM 8 AM to 10 PM");
        JRadioButton r3=new JRadioButton("C) MON TO FRI 8 AM to 10 PM");
        ButtonGroup g1 = new ButtonGroup();
        
        g1.add(r1);
        g1.add(r2);
        g1.add(r3);
        
        f1.setSize(900,700);
        
        l1.setBounds(50,50,100,50);
        t1.setBounds(350,50,470,50);
        l2.setBounds(50,120,150,50);
        t2.setBounds(350,120,470,50);
        l2b.setBounds(50,190,250,50);
        t2b.setBounds(350,190,470,50);
        l3.setBounds(50,260,150,50);
        t3.setBounds(350,260,470,50);
        l4.setBounds(50,330,180,50);
        t4.setBounds(350,330,470,50);
        l5.setBounds(50,400,150,50);
        r1.setBounds(350,400,400,50);
        r2.setBounds(350,435,400,50);
        r3.setBounds(350,470,400,50);
        b4.setBounds(620,550,200,50);
        l.setBounds(50,311,205,12);
        l70.setBounds(50,241,210,12);
        l80.setBounds(50,445,160,12);
        
        l1.setFont(font);
        t1.setFont(font);
        l2.setFont(font);
        t2.setFont(font);
        l2b.setFont(font);
        t2b.setFont(font);
        l3.setFont(font);
        t3.setFont(font);
        l4.setFont(font);
        t4.setFont(font);
        l5.setFont(font);
        r1.setFont(font);
        r2.setFont(font);
        r3.setFont(font);
        b4.setFont(font);
        
        l70.setForeground(Color.red);
        l80.setForeground(Color.red);
        l.setForeground(Color.red);
        
        f1.setLayout(null);
        
        f1.add(l1);
        f1.add(t1);
        f1.add(l2);
        f1.add(t2);
        f1.add(l2b);
        f1.add(t2b);
        f1.add(l3);
        f1.add(l);
        f1.add(t3);
        f1.add(l4);
        f1.add(t4);
        f1.add(l5);
        f1.add(r1);
        f1.add(r2);
        f1.add(r3);
        f1.add(b4);
        f1.add(l70);
        f1.add(l80);
        
        f1.setVisible(true);
        
        b4.addActionListener(new ActionListener(){
        	
            public void actionPerformed(ActionEvent e4)
            {
                l.setText(" ");
                l70.setText(" ");
                l80.setText(" ");
            	String x =t2.getText();
                String y =t2b.getText();
                
                if(x.equals(y))
                {
                	if(r1.isSelected()) {
                		
                		new do_register(t1.getText(),t2.getText(),t3.getText(),t4.getText(),1);
                		if(do_register.main(new String[0])==1) {
                			l.setText("** EMAIL ALREADY REGISTERED **");
                		}else {
                			
                			f1.setVisible(false);
                			JFrame f5=new JFrame("REGISTRATION STATUS");
                                        JLabel b6=new JLabel("Registered Succesfully");
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
                		
                	}else if(r2.isSelected()) {
                		
                		new do_register(t1.getText(),t2.getText(),t3.getText(),t4.getText(),2);
                		if(do_register.main(new String[0])==1) {
                			l.setText("Email already registered");
                		}else {
                			
                			f1.setVisible(false);
                			JFrame f5=new JFrame("REGISTRATION STATUS");
                                        JLabel b6=new JLabel("Registered Succesfully");
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
                		
                	}else if(r3.isSelected()) {
                		
                		new do_register(t1.getText(),t2.getText(),t3.getText(),t4.getText(),3);
                		if(do_register.main(new String[0])==1) {
                			l.setText("Email already registered");
                		}else {
                			
                			f1.setVisible(false);
                			
                			JFrame f5=new JFrame("REGISTRATION STATUS");
                                        JLabel b6=new JLabel("Registered Succesfully");
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
        
	}
}
