package javaIO;
import java.io.*;
public class InputStream {
public static void main(String []args)throws IOException{
FileInputStream fin=new FileInputStream("E://file/file.txt");
int i;
while((i=fin.read())!=-1)
		{
	System.out.print((char)i);
		}

fin.close();
}
}
