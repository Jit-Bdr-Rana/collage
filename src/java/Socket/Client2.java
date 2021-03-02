import java.net.*;
import java.io.*;
import java.util.*;
public class Client2 extends Socket {

	public static void main(String[] args)throws Exception {
		Socket s=new Socket("localhost",6000);

		DataInputStream dis=new DataInputStream(s.getInputStream());
       
       String str="";

       str=dis.readUTF();
       System.out.println("Server Says:"+str);  

	}
}