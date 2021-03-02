package package1;
import java.util.Scanner;
public class stringexample {
	
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		int age=Integer.parseInt(input.nextLine());
		
		if(age>60)
		{
			throw new TooYoungException("you age is too younge");
		}
		
		else if(age>18)
		{
			throw new TooOldException("you age is too old");
		}
		else
		{
			System.out.println("Thanks for registration");
			
		}
	}
	
}