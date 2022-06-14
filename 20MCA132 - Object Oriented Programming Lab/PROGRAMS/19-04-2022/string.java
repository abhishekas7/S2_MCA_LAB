import java.util.*;
class string{


	public static void main(String args[])
		{
	System.out.println("Enter the String1 : ");
	Scanner sc=new Scanner(System.in);
	String str1=sc.nextLine();
	
	System.out.println("Enter the String2 : ");
	String str2=sc.nextLine();	

	System.out.println("Concat:"+ str1+""+str2);
	System.out.println("Equals:"+ str1.equals(str2));
		}
}
