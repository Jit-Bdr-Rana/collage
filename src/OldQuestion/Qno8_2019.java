package OldQuestion;
import java.util.*;

public class Qno8_2019 {
	
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		
		 int age=sc.nextInt();
		
		try {
			if(age<18)
			{
				throw new InvalidAgeException("you are too samall");
			}	
			else
				{
					System.out.print("you can now allow to vote");
					
				}
		
			
		}
		catch(InvalidAgeException e) {
			System.out.println(e);
		}
		
		
	}

}

class InvalidAgeException extends Exception {
	InvalidAgeException(String s)
	{
		super(s);
	}
}

