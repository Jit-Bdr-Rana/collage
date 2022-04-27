import java.rmi.*;
import java.rmi.server.*;
import java.util.*;

public class Client {
	public static void main(String[] args)throws Exception {
		StudentInterface stuList=(StudentInterface)Naming.lookup("rmi://localhost:6666/jit");
		List<Student> li=stuList.getStudent();
    for(Student stu:li){

    	System.out.println("/n"+stu.getId()+stu.getName()+stu.getRoll()+stu.getAge());
    }
	}
}