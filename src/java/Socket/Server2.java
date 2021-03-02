import java.net.*;
import java.io.*;
import java.util.*;
public class Server2 {
	public static void main(String[] args)throws Exception {
		ServerSocket sc=new ServerSocket(6000);
		Socket s=sc.accept();

		DataOutputStream dos=new DataOutputStream(s.getOutputStream());
		dos.writeUTF("Hellow Client");
	}

}