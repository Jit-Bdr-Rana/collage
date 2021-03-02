package applet;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class passingpram extends JFrame {
	static JButton b;
	passingpram()
	{   this.setSize(600,500);
		this.setVisible(true);
		this.setTitle("Buttons Frame");
		this.setLayout(new FlowLayout(FlowLayout.LEFT));
		b=new JButton("click me");
		this.add(b);
	}
	
	public static void main(String []args)
	{
		new passingpram();
	}

}
