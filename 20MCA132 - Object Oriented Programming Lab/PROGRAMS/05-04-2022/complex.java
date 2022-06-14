import java.util.*;
class complex
{
	public static void main(String args[])
	{
		int r3,im3;
		
		System.out.println("First number");
		System.out.println("Enter the real part");
		Scanner sc = new Scanner(System.in);
		int r1 = sc.nextInt();
		System.out.println("Enter the imaginary part");
		int im1 = sc.nextInt();
		
		System.out.println("\n\nSecond number");
		System.out.println("Enter the real part");
		int r2 = sc.nextInt();
		System.out.println("Enter the imaginary part");
		int im2 = sc.nextInt();
		
		System.out.println("\n\nFirst number is:");
		System.out.println(r1+"+i"+im1);
		System.out.println("Second number is:");
		System.out.println(r2+"+i"+im2);
		
		r3=r1+r2;
		im3=im1+im2;
		System.out.println("After addition:");
		System.out.println(r3+"+i"+im3);
	}
}
