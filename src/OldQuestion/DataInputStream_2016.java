package OldQuestion;
import java.io.*;
public class DataInputStream_2016 {
	public static void main(String []args)throws IOException
	{
	   FileOutputStream fp=new FileOutputStream("E://file/purbanchal.dat");
       DataOutputStream dos= new DataOutputStream(fp);
       dos.writeChars("I am student of BIT VI semester");
       dos.flush();
       dos.close();
		
	}

}
