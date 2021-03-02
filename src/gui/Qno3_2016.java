package gui;
import java.awt.*;
import java.awt.event.*;


import javax.swing.*;
public class Qno3_2016 extends JFrame{
	
	Qno3_2016(){
		
		JFrame j=new JFrame("Java Program Calculator ");
	
		
		JLabel j1,j2,j3,j4;
		JTextField jtf1,jtf2,jtf3;
		JButton jb1,jb2;
		
		j1=new JLabel("Calculator");
		  j1.setSize(200,20);
		  j1.setLocation(20,50);
		j.add(j1);
		
		j2=new JLabel("First Name");
		  j2.setSize(200,20);
		  j2.setLocation(20,80);
		j.add(j2);	
		
		jtf1=new JTextField();
		jtf1.setSize(200,20);
		jtf1.setLocation(110,80);
		j.add(jtf1);
		
		j3=new JLabel("Second Name");
		  j3.setSize(200,20);
		  j3.setLocation(20,110);
		j.add(j3);
		
		jtf2=new JTextField();
		jtf2.setSize(200,20);
		jtf2.setLocation(110,110);
		j.add(jtf2);
		
		j4=new JLabel("Result ");
		  j4.setSize(200,20);
		  j4.setLocation(20,140);
		j.add(j4);
		
		jtf3=new JTextField();
		jtf3.setSize(200,20);
		jtf3.setLocation(110,140);
		j.add(jtf3);
		
		jb1=new JButton("Add");
		jb1.setSize(100,20);
		jb1.setLocation(80,170);
		j.add(jb1);
		jb1.addActionListener(new ActionListener(){
	    	   public void actionPerformed(ActionEvent e)
	    	   {
	    		   int x,y,z;
	    		   x=Integer.parseInt(jtf1.getText());
	    		   y=Integer.parseInt(jtf2.getText());
	    		   z=x+y;
	    		   jtf3.setText(String.valueOf(z));
	    		   
	    	       
	    	   }
		});
		
		jb2=new JButton("SUB");
		jb2.setSize(100,20);
		jb2.setLocation(190,170);
		j.add(jb2);
		jb2.addActionListener(new ActionListener() {
		
			public void actionPerformed(ActionEvent e) {
				int x,y,z;
	    		   x=Integer.parseInt(jtf1.getText());
	    		   y=Integer.parseInt(jtf2.getText());
	    		   z=x-y;
	    		   jtf3.setText(String.valueOf(z));
				
			}
			
		});
		
		j.setSize(600,600);  
        j.setLayout(null);  
		j.setVisible(true);
		
		
	}
	
	public static void main(String []args)
	{
		new Qno3_2016();
	}
}