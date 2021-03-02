package javaIO;
import java.io.*;

public class FileReaderExample {
	
	public static void main(String args[])throws Exception
	{
		Reader fp=new FileReader("E://file/student.txt");
		int i;
		while((i=fp.read())!=-1)
		{
			System.out.print((char)i);
			
		}
		fp.close();
		
	}

}
