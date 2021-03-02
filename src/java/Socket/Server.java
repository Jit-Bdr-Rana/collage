import java.io.*;
import java.net.*;
import java.util.*;

public class Server{

	public static void main(String[] args)throws Exception {
    ServerSocket ss=new ServerSocket(6566);
    Socket s=ss.accept();
    DataOutputStream dos=new DataOutputStream(s.getOutputStream());
    DataInputStream dis=new DataInputStream(s.getInputStream());
    
     Scanner sc=new Scanner(System.in);
     System.out.println("Server running.....");
        String msg="";
         while(!msg.equals("stop"))
         {
        
		 String smsg=dis.readUTF();
         System.out.println("client says="+smsg);
          msg=sc.next();
		 dos.writeUTF(msg);
         }

         dos.flush();
		dos.close();
		dis.close();
		s.close();		
	}
}