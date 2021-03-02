package javaIO;
import java.io.*;
public class DataOutputStreamExample {
	
	public static void main(String args[])throws Exception
	{
		OutputStream os=new FileOutputStream(new File("E://file/data.txt"));
		DataOutputStream dos=new DataOutputStream(os);
//		dos.write(65);
//		dos.writeBoolean(true);
//		dos.writeChar(6585);
//		dos.writeChars("Jitu rana maga g to ol to the d oad f kadhsf oa sdf h dfasohf  oadshf oas df oasdhf asof h ");
//		dos.writeByte(1526447852);
		dos.writeBytes("jituranamnagaraljhhfakjahnsdfjhasokiadhsfaskohjfasdjoaisfjoaisfj");
		dos.flush();
		
	}

}
