
class NotEligibleForVote extends RuntimeException{
	NotEligibleForVote(String s)
	{
		 super(s);
	}
	
}

class Test{
	
 public static void main(String []args)
 {
	 int age=Integer.parseInt(args[0]);
		if(age<18 )
		{
			throw new NotEligibleForVote("Whoops!! you are not eligible for vote ");
		}
		
		
		else
		{
			System.out.println("Congratulation you are eligible for vote");
			
		}
	 
 }
}