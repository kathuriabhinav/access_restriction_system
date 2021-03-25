package oom_group_15;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class mainmenu {
    mainmenu()	{
        JFrame f;
	    JButton b1,b2,b3;
	    
	    f=new JFrame("MAIN PAGE");
	    
	    b1=new JButton("REGISTRATION");
	    b2=new JButton("UPDATE");
	    b3=new JButton("DISPLAY");
	    
	    f.setSize(900,700);
	    
	    b1.setBounds(300,200,250,90);
	    b2.setBounds(300,300,250,90);
	    b3.setBounds(300,400,250,90);
	    f.add(b1);
	    f.add(b2);
	    f.add(b3);
	    
	    Font font1=new Font("Verdana",Font.BOLD,18);
	    b1.setFont(font1);
	    b2.setFont(font1);
	    b3.setFont(font1);
	    
	    f.setLayout(null);
	    f.setVisible(true);
            f.setDefaultCloseOperation(3);
	    
	    b1.addActionListener(new ActionListener(){
	    	
	        public void actionPerformed(ActionEvent e)
	        {
	            new registration();
	        }
	    });
	    
	    b2.addActionListener(new ActionListener(){
	    	
	         public void actionPerformed(ActionEvent e3)
	         {
	             new updation();
	         }
		});
	    
	    b3.addActionListener(new ActionListener(){
	    	
	        public void actionPerformed(ActionEvent e3)
	        {
	             new display();
		    }
		});
	}
}
