package javaIO;
import java.io.*;
public class BufferInputStream {
	public static void main(String args[]) throws IOException
	{
		FileInputStream fin=new FileInputStream("E://file/file.txt");
		BufferedInputStream bin=new BufferedInputStream(fin);
		int i;
		while((i=bin.read())!=-1) {
			System.out.println((char)i);
		}
		
	}

}
