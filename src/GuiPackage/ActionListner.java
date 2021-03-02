package GuiPackage;
import java.awt.BorderLayout;
import java.awt.Insets;
import java.awt.event.*;
import javax.swing.*;

public class ActionListner extends JFrame {
	public static void main(String []args)
	{
		JFrame f=new JFrame("Button Example");
		final JTextField tf=new JTextField();
		tf.setBounds(50,50,150,20);
		tf.setMargin(new Insets(150, 150, 150, 50));
		JButton b=new JButton("Click me");
		b.setBounds(20,100,95,30);
	    JLabel l=new JLabel("first number");  
	  
	    
        l.setBounds(50,50, 100,30);      
		b.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e)
			{
				tf.setText("Welcome to Javatpoint");
			}
			
		});
		
		f.add(b,BorderLayout.NORTH);
		f.add(l);
		f.add(tf);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
				
	}

}
