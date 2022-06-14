class ajcethread implements Runnable {
	public void run(){
		
		for(int i=0;i<50;i++)
		{
			System.out.println("AJCE");
		}
	
	}
}

	

public class threadrunnable{
	public static void main(String arg[])
	{
	Thread a = new Thread(new ajcethread());
		a.start();
	for(int i=0;i<50;i++)
		{
			System.out.println("REPLAY");
		}
	

	
	}
	
	
}
	
	