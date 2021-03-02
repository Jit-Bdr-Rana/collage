package gui;
import javax.swing.JTable;
import javax.swing.JFrame;
import javax.swing.JScrollPane;

public class jtable {
	JFrame f;
	jtable(){
		f=new JFrame();
		String data[][]= {
				{"101","jit","123999"},
				{"102","sajan","124444"},
				{"103","alok","344"}
		};
		String column[]= {"ID","NAME","SALARY"};
		JTable jt=new JTable(data,column);
		f.setSize(200,200);
		f.setLocation(200,200);
		
		jt.setBounds(30,40,200,300);
		JScrollPane sp=new JScrollPane(jt);
		f.add(sp);
		f.setVisible(true);
	}
	public static void main(String []args)
	{
		new jtable();
	}
	

}
