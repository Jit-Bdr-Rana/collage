package javaIO;
 
import java.io.*;
public class FileWriterExample {
 

    public String name="jit rana magar";
	public String address="maitidevi area";
	public static void main(String []args)throws IOException
	{
//	    Writer fp=new FileWriter(new File("E://file/student.txt"));
//		FileWriterExample f=new FileWriterExample();
////		BufferedWriter  bfr=new BufferedWriter(fp);
//		fp.write(f.name);
////	    fp.newLine();
//		fp.write(f.address);
//		fp.flush();
//		fp.close();
//		System.out.println("Success.........");
		
		
		
		//for bufferwriter 
		Writer fp=new FileWriter(new File("E://file/student.txt"));
		FileWriterExample fwr=new FileWriterExample();
		BufferedWriter bfwr=new BufferedWriter(fp);
		bfwr.write(fwr.name);
		bfwr.write(fwr.address);
		bfwr.newLine();
		bfwr.flush();
		bfwr.close();
		System.out.println("Successfully done.....");
		
		
		
		
	}
	
}
