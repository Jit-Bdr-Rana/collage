import java.io.*;
import java.net.*;
import java.util.*;
public class Client{


	public static void main(String[] args)throws Exception {
		
		Socket s=new Socket("localhost",6566);
		DataOutputStream dos=new DataOutputStream(s.getOutputStream());
		DataInputStream dis=new DataInputStream(s.getInputStream());
        Scanner sc=new Scanner(System.in);
          System.out.println("Client running.....");

        String msg="";
         while(!msg.equals("stop"))
         {
            msg=sc.next();
		 dos.writeUTF(msg);
		 String smsg=dis.readUTF();
         System.out.println("Server says="+smsg);

         }
          
		dos.flush();
		dos.close();
		dis.close();
		s.close();

	}
}