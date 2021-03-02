package OldQuestion;

public class Qno7_2019 implements Runnable{
	
	@Override
	public void run()  {
		int x=1;
		
		try {
			for(x=1;x<=20;x++) {
				System.out.println(x);
				Thread.sleep(2000);
			}
		}
			
			catch(Exception e)
			{
				System.out.println(e);
			}
		
		
	}
	public static void main(String args[]) {
		Qno7_2019 t1=new Qno7_2019();
		Thread t2=new Thread(t1);
		t2.start();
		
	}

}
