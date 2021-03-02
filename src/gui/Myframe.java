package gui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Myframe   {
	
	public static void main(String []args)
	{
		 ImageIcon image = new ImageIcon("sun.jpeg");
		 Border border =BorderFactory.createLineBorder(Color.green,3);
		
		 JLabel label=new JLabel();
		 label.setText("Bro do you even code");
//		
		 label.setHorizontalTextPosition(JLabel.CENTER);
		 label.setVerticalTextPosition(JLabel.TOP);
		 label.setForeground(new Color(0x00ff00));
		 label.setFont(new Font("MV Boli",Font.PLAIN,20));
		 label.setBackground(Color.blue);
		 label.setOpaque(true);
		 label.setBorder(border);
		 
		 JFrame frame= new JFrame();
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 frame.setSize(500,500);
		 frame.setVisible(true);
		 frame.add(label);
	}

}
