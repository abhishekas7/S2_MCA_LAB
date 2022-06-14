import java.util.*;
class Division{
	public static void main(String arg[])
	{
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st number : ");
		a=sc.nextInt();
		System.out.println("Enter the 2nd number : ");
		b=sc.nextInt();
		
	
	try{
		c=a/b;
	}
	catch(Exception e)
	{
		System.out.println("division with zero error");
	}
}
}