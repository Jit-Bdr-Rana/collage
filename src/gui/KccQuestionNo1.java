package gui;
import java.awt.event.*;
import javax.swing.*;
public class KccQuestionNo1 extends JFrame {
	
	public void formSet() {

		  JLabel j1,j2,j3,j4,j5;
	 
		  JTextField jtf1,jtf2;

		  
		  
		  JFrame f= new JFrame("CheckBox Example");  
		  
		  
		  j1=new JLabel("Id");
		  j1.setSize(200,20);
		  j1.setLocation(20,50);
		  f.add(j1);
		  
		  jtf1 =new JTextField();
		  jtf1.setSize(200,20);
		  jtf1.setLocation(100,50);
		  f.add(jtf1);
		  
		  j2=new JLabel("Name");
		  j2.setSize(200,20);
		  j2.setLocation(20,100);
		  f.add(j2);
		  
		  jtf2 =new JTextField();
		  jtf2.setSize(200,20);
		  jtf2.setLocation(100,100);
		  f.add(jtf2);
		  
		  
		     j3=new JLabel("Gender ");
		     j3.setBounds(20,150,100,100);
		     f.add(j3);
		     
		     
		     JRadioButton RadioButton1 = new JRadioButton("Male");  
		     RadioButton1.setBounds(100,150, 100,100);  
		     RadioButton1.setActionCommand("Male");
		     
	        JRadioButton RadioButton2 = new JRadioButton("Female");  
	        RadioButton2.setBounds(200,150, 100,100); 
	        RadioButton2.setActionCommand("Female");
	        
	        ButtonGroup G = new ButtonGroup(); 
	        G.add(RadioButton2);
	        G.add(RadioButton1);
	        
	        f.add(RadioButton2); 
	        f.add(RadioButton1);  
	        
	        
			  j4=new JLabel("Program");
			  j4.setBounds(20,250,150,40);
			  f.add(j4);
			  
			  
			  String pro[]= {"c","c++","java","php"};
			  JComboBox jcb=new JComboBox(pro);
			  jcb.setBounds(100,250,150,40);
		       f.add(jcb);
	        
	      
	      
		    
		     j5=new JLabel("Os you use");
		     j5.setBounds(20,300,100,100);
		     f.add(j5);
		     
	        JCheckBox checkBox1 = new JCheckBox("Window");  
	        checkBox1.setBounds(100,300, 100,100);  
	        checkBox1.setActionCommand("Window");
	        
	        JCheckBox checkBox2 = new JCheckBox("Mac");  
	        checkBox2.setBounds(200,300, 100,100);  
	        checkBox2.setActionCommand("Mac");
	        
	        JCheckBox checkBox3 = new JCheckBox("Linux");  
	        checkBox3.setBounds(300,300, 100,100); 
	        checkBox3.setActionCommand("Linux");
	        
	        ButtonGroup bg=new ButtonGroup();
	        bg.add(checkBox1);
	        bg.add(checkBox2);
	        bg.add(checkBox3);
	        
	        
	        f.add(checkBox1);  
	        f.add(checkBox2); 
	        f.add(checkBox3);
	        
	        
	       JButton jb1=new JButton("Clear");
	       jb1.setBounds(150,400,90,50);
	       f.add(jb1);
	       jb1.addActionListener(new ActionListener(){
	    	   public void actionPerformed(ActionEvent e)
	    	   {
	    		   int id=Integer.parseInt(jtf1.getText());
	    		   String name=jtf2.getText();
	    		   System.out.println("Selected Radio Button: " + G.getSelection().getActionCommand());
	    		   
	    		   String program = jcb.getSelectedItem().toString();
	    		   String gender=G.getSelection().getActionCommand();
	    		   
	    		   String osYouUse=bg.getSelection().getActionCommand();
	    		   
	    		   String All="id="+id+" name="+name+" gender="+gender+" program"+program+" osYouUse"+osYouUse;
	    		   JOptionPane.showMessageDialog(f,All,"Alert",JOptionPane.WARNING_MESSAGE);    
	    		   
	    	   }
	       });

		
       
	       
	       
	       JButton jb2=new JButton("Save");
	       jb2.setBounds(300,400,90,50);
	       f.add(jb2);
		  
		  
	        f.setSize(600,600);  
	        f.setLayout(null);  
	        f.setVisible(true);  
		
	}
	
	
	public static void main(String args[])
	{
		KccQuestionNo1 Q1=new KccQuestionNo1();
		Q1.formSet();
	}

}
