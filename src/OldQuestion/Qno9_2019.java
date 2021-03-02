package OldQuestion;
import javax.swing.*;

import GuiPackage.ActionListner;

import java.awt.*;
import java.awt.event.*;
public class Qno9_2019 extends JFrame{

	Qno9_2019(){
		JFrame jf=new JFrame("square");
		JLabel jl1,jl2;
		JTextField jtf1,jtf2;
		JButton jb1;
		
	
		jl1=new JLabel("Enter Number");
		  jl1.setSize(200,20);
		  jl1.setLocation(20,50);
		  jf.add(jl1);
		  
		  jtf1=new JTextField();
		  jtf1.setBounds(100,50,200,20);
		  jf.add(jtf1);
		
			jl2=new JLabel("Square is ");
			  jl2.setSize(200,20);
			  jl2.setLocation(20,80);
			  jf.add(jl2);
			  
			  jtf2=new JTextField();
			  jtf2.setBounds(100,80,200,20);
			  jf.add(jtf2);
			  
			  
			  
			  jb1=new JButton("Area");
			  jb1.setBounds(100,120,100,20);
			  jf.add(jb1);
			  
			  jb1.addActionListener(new ActionListener(){
				

				@Override
				public void actionPerformed(ActionEvent e) {
				  int x=Integer.parseInt(jtf1.getText());
				  jtf2.setText(String.valueOf(x*x));
				}
			  
			  });

	        jf.setBounds(200,200,600,600);  
	        jf.setLayout(null);  
	        jf.setVisible(true);  
		
	}
	public static void main(String args[]) {
		new Qno9_2019();
	}
}
