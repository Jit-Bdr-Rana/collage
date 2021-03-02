package socket;
import java.io.*;
import java.net.*;
public class MyClient {
public static void main(String []args)throws Exception{
Socket s=new Socket("localhost",6668);
DataOutputStream dout=new  DataOutputStream(s.getOutputStream());
dout.writeUTF("Hellowserver");
dout.flush();
dout.close();
s.close();
}
}
