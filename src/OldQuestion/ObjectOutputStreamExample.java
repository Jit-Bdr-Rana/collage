package OldQuestion;
import java.io.*;
public class ObjectOutputStreamExample {

	public static void main(String[] args)throws Exception
	{
	  Student s=new Student("jit","Maitidevi");
	  OutputStream out=new FileOutputStream(new File("E://file/object.txt"));
	  ObjectOutputStream obstream=new ObjectOutputStream(out);
	  
	  obstream.writeObject(s);
	  out.flush();
	  out.close();
	  
	
	}
	
}
