package OldQuestion;

import java.util.Scanner;

public class que_2019 implements  sum_and_average_interface {
	  int x, y, z;
	    Scanner sc = new Scanner(System.in);
	public void  input()
	{
	  System.out.println("enter two number");
	  x=sc.nextInt();
	  y=sc.nextInt();
	  
	}
	
	public void sum()
	{
		z=x+y;
	}
	
	public void display()
	{
		System.out.println(z);
	}
	public static void main(String[] args)
	{
		que_2019 s=new que_2019();
		s.input();
		s.sum();
		s.display();
	}

}
