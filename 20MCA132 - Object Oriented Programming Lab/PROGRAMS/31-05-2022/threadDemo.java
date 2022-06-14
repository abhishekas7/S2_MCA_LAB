class ajcethread extends Thread{
	public void run(){
		
		for(int i=0;i<10;i++)
		{
			System.out.println("AJCE");
		}
	
	}
}

	

public class threadDemo{
	public static void main(String arg[])
	{
	ajcethread a = new ajcethread();
	for(int i=0;i<10;i++)
		{
			System.out.println("REPLAY");
		}
	
	a.start();
	
	}
	
	
}
	
	