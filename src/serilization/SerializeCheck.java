package serilization;
import java.io.*;
public class SerializeCheck {
	public static void main(String args[])throws Exception
	{
		Student s1=new Student(211,"raj");
		OutputStream fout=new FileOutputStream("E://file/serialize.txt");
		
		ObjectOutputStream  out=new ObjectOutputStream(fout);
		out.writeObject(s1);
		out.flush();
		fout.close();
		System.out.println("success");
		
	}

}
