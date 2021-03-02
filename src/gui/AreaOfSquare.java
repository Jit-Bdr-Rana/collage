package gui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Set;
public class AreaOfSquare extends JFrame{
	
	private JTextField jf1,jf2;
	private JLabel l1,l,l2;
	private JButton jb1;
	private Container c;
	
	  AreaOfSquare()
	 { 
		  c= getContentPane();
		  setTitle("Area Of Square");
		  setBounds(30,300,900,600);
		  setDefaultCloseOperation(EXIT_ON_CLOSE);
		  setResizable(true);
		   
		  
		    l=new JLabel("Area Calculator");
		    l.setFont(new Font("Arial",Font.BOLD,30));
		    l.setSize(300,20);
		    l.setLocation(500,10);
		    c.add(l);
		  
		     l1= new JLabel("Enter Radius");
		     l1.setFont(new Font("Times new roman",Font.PLAIN,20));
		     l1.setSize(200,20);
		     l1.setLocation(0,40);
		     c.add(l1);
		     
		     jf1=new JTextField();
		     jf1.setFont(new Font("Times new roman",Font.BOLD,20));
		     jf1.setSize(200,20);
		     jf1.setLocation(150,40);
		     c.add(jf1);
		     
		     l2= new JLabel("Area of Circle is");
		     l2.setFont(new Font("Times new roman",Font.PLAIN,20));
		     l2.setSize(200,20);
		     l2.setLocation(0,80);
		     c.add(l2);
		     
		     jf2=new JTextField();
		     jf2.setFont(new Font("Times new roman",Font.BOLD,20));
		     jf2.setSize(200,20);
		     jf2.setLocation(150,80);
		     c.add(jf2);
		     
		     jb1=new JButton("Area");
		     jb1.setFont(new Font("Arial",Font.BOLD,20));
		     jb1.setSize(200,20);
		     jb1.setLocation(150,120);
		     c.add(jb1);
		     
		     jb1.addActionListener(new ActionListener() { 
		    	 public void actionPerformed(ActionEvent e)
		    	 {
		    		 int a=Integer.parseInt(jf1.getText());
		    		 float c=(22/7)*a*a;
		    		 jf2.setText(String.valueOf(c));
		    	 }
		    	 
		    		 
		    	 
		     
		     });
		  
		  c.setLayout(null);
		 setVisible(true);
	 }
	
	public static void main(String args[]) {
     AreaOfSquare a= new AreaOfSquare();
  
	}
}
