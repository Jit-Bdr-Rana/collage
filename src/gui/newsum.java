package gui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class newsum extends JFrame {
	private Container c;
	private JLabel l1,l2,l3,l4;
	private JTextField jf1,jf2,jf3,jf4;
	private JButton jb;
	
	public newsum()
	{
		setTitle("Sum form");
		setBounds(300,90,900,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		c=getContentPane();
		c.setLayout(null);
		
		//label
		l1=new JLabel("Sum Form");
		l1.setFont(new Font("Arial",Font.PLAIN,30));
		l1.setSize(300,30);
		l1.setLocation(300,30);
		c.add(l1);
		
		l2=new JLabel("Enter First number");
		l2.setFont(new Font("Arial",Font.PLAIN,20));
		l2.setSize(300,30);
		l2.setLocation(20,100);
		c.add(l2);
		
		jf1=new JTextField();
		jf1.setFont(new Font("Arial",Font.PLAIN,20));
		jf1.setSize(200,20);
		jf1.setLocation(250,105);
		c.add(jf1);
		
		l3=new JLabel("Enter Second Number");
		l3.setFont(new Font("Arial",Font.PLAIN,20));
		l3.setSize(200,20);
		l3.setLocation(20,150);
		c.add(l3);
		
		jf2=new JTextField();
		jf2.setFont(new Font("Arial",Font.PLAIN,20));
		jf2.setSize(200,20);
		jf2.setLocation(250,150);
		c.add(jf2);
		
		l4=new JLabel("Result is");
		l4.setFont(new Font("Arial",Font.PLAIN,20));
		l4.setSize(200,20);
		l4.setLocation(20,200);
		c.add(l4);
		
		jf4=new JTextField();
		jf4.setFont(new Font("Arial",Font.PLAIN,20));
		jf4.setSize(200,20);
		jf4.setLocation(250,200);
		c.add(jf4);
		
		jb=new JButton("add");
		jb.setFont(new Font("Arial",Font.BOLD,20));
		jb.setSize(80,40);
		jb.setLocation(250,300);
		jb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=Integer.parseInt(jf1.getText());
				int b=Integer.parseInt(jf2.getText());
				int c=a+b;
				jf4.setText(String.valueOf(c));
			}
			
		}); 
		c.add(jb);
		
	
		
		
		setVisible(true);
		
	}
	public static void main(String[] args)
	{
		newsum f=new newsum();
	}
	
	
	

}
