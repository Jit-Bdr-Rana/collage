package package1;

public class threadclass extends Thread {

	public void run() {
		try {
			for(int i=1;i<10;i++)
			{
				
				System.out.println(i);
				Thread.sleep(2000);
			}
			
		}
		catch(InterruptedException e) {
			System.out.println("Exception....");
		}
	}
	public static void main(String[] args)
	{
		threadclass t1=new threadclass();
//		Thread thread=new Thread(t1);
		
		t1.start();
	}

}

