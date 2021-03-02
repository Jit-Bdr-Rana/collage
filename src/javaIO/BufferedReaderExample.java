package javaIO;
import java.io.*;

public class BufferedReaderExample {
public static void main(String []args)
{
	try {
		Reader r=new FileReader(new File("E://file/student.txt"));
		BufferedReader bfr=new BufferedReader(r);
		System.out.println(bfr.readLine());
	
	}
	
	catch(Exception e)
	{
		System.out.println(e);
	}
}
}
