package OldQuestion;
import java.io.*;
import java.util.Scanner;
public class Qno4_2019 {

	public static void main(String[] args)throws Exception {
		
		Writer fw=new FileWriter(new File("E://file/file.txt"));
		BufferedWriter bwr=new BufferedWriter(fw);
    
		Scanner sc=new Scanner(System.in);
		
		String useText=sc.next();
		System.out.println(useText);
		bwr.write(useText);
		bwr.close();
		fw.close();
		 
		// read
		
		Reader r=new FileReader(new File("E://file/file.txt"));
		BufferedReader br=new BufferedReader(r);
		String stringFromFile=br.readLine();
		System.out.println("Txt from file is:"+stringFromFile);
		 
		r.close();
		br.close();
	
		
		
		
	}
	
}
