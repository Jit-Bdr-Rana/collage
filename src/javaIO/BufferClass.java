package javaIO;
import java.io.*;
public class BufferClass {
	public static void main(String args[]) throws Exception
	{
		FileReader fr=new FileReader("E://file/file.txt");
		BufferedReader br=new BufferedReader(fr);
		int i;
		
		while((i=br.read())!=-1)
		{
			System.out.print((char)i);
		}
		
		
	}

}
