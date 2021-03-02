package OldQuestion;
import java.util.*;
import java.io.*;
public class IO_2019 {
	public static void main(String []args)throws IOException {
	 FileWriter fw=new FileWriter(new File("E://file/myfile.txt"));
	 BufferedWriter bfw=new BufferedWriter(fw);
	 Scanner sc=new Scanner(System.in);
	 String s=sc.nextLine();
	 
	 bfw.write(s);
	 
	 bfw.flush();
	 bfw.close();
	 
	 FileReader fr=new FileReader("E://file/myfile.txt");
	 BufferedReader bfr=new BufferedReader(fr);
	 System.out.println(bfr.readLine());
	  
	  bfr.close();
	 
	}

}
