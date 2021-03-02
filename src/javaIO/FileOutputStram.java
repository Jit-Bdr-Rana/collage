package javaIO;

import java.io.FileOutputStream;
import java.io.*;

public class FileOutputStram {
	
	public static void main(String []args)throws IOException
	{
		
			FileOutputStream fout=new FileOutputStream("E://file/file.txt");
			String s="Welcom to the hell ";
			byte b[]=s.getBytes();
			fout.write(b);
			fout.write(65);
			fout.close();
			System.out.println("Success");
			
		
		
	}

}
