package javaIO;
import java.io.*;

public class BufferOutputStream {
	public static void main(String []args) throws IOException
	{
		FileOutputStream fout=new FileOutputStream("E://file/file.txt");
		BufferedOutputStream bouts=new BufferedOutputStream(fout);
		String s="Welcome To javaTopint";
		byte b[]=s.getBytes();
		bouts.write(b);
		bouts.flush();
		bouts.close();
		fout.close();
		System.out.println("Success");
		
	}

}
