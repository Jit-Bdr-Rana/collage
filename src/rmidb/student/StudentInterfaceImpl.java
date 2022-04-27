import java.rmi.*;
import java.rmi.server.*;
import java.sql.*;
import java.util.*;
public class StudentInterfaceImpl extends UnicastRemoteObject  implements StudentInterface{
	StudentInterfaceImpl()throws Exception{

	}
   Connection con;
	public List<Student> getStudent()throws Exception{
     List <Student> stuList=new ArrayList<Student>();
     Class.forName("com.mysql.jdbc.Driver");
     con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","");
     System.out.println("connection establish");
     PreparedStatement pres=con.prepareStatement("select * from student");
     ResultSet re=pres.executeQuery();
     while(re.next())
     {
       Student stu=new Student(re.getInt(1),re.getString(2),re.getString(3),re.getString(4));
       stuList.add(stu);

     }
     return stuList;
  

	}
	public static void main(String[] args)throws Exception {
		StudentInterfaceImpl n=new StudentInterfaceImpl();

	}

}