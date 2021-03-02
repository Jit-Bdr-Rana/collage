package gui;
import java.awt.Container;

import javax.swing.*;
public class GuiExample {

	public static void main(String args[])
	{
		JFrame jf = new JFrame("sample");
		jf.setBounds(300,300,400,400);
		Container contentPane=jf.getContentPane();
		JButton btnok=new JButton("OK");
		btnok.setSize(200,200);
		btnok.setLocation(200,200);
            contentPane.add(btnok);

	   jf.setVisible(true);
	   
	}
	
}
