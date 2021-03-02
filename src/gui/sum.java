package gui;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Button;
import java.awt.Label;
import java.awt.Frame;

public class sum extends Frame {
	TextField tf1;
	TextField tf2,tf3;
	Label l1,l2,l3;
	Button b;
	sum(){
	      setTitle("Adder"); 
          tf1 = new TextField(); 
          tf1.setBounds(100, 50, 85, 20);
          tf2 = new TextField(); 
          tf2.setBounds(100, 100, 85, 20); 
          tf3=new TextField();
          tf3.setBounds(100,150,85,20);
          b = new Button("Add"); 
          b.setBounds(100,50,0,0);
          l1 = new Label("Enter A"); 
          l1.setBounds(100, 50, 0, 0); 
          
          l3 = new Label("SUM="); 
          l3.setBounds(100, 150, 0, 0); 
          
          l2 = new Label("Enter B"); 
          l2.setBounds(100, 100, 0, 0); 
          
          add(b); 
         
          add(tf1); 
          add(l3);
          add(tf2); 
          add(l2);
          add(tf3);
          add(l1); 
          setSize(300,300); 
          setVisible(true);
          b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
            	int a=Integer.parseInt(tf1.getText());
            	int b=Integer.parseInt(tf2.getText());
            	int c=a+b;
            	tf3.setText(String.valueOf(c));
            	
            }
          });
	}
	public static void main(String args[])
	{
		new sum();
	}

}
