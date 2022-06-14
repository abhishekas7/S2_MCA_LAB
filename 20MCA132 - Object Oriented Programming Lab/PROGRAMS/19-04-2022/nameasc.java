import java.util.Scanner;
class nameasc
{
	public static void main(String args[])
	{
		int i,j;
		String temp;
		System.out.println("Enter the size:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String names[]=new String[n];
		System.out.println("Enter the names");
		Scanner sn=new Scanner(System.in);
		for(i=0;i<n;i++)
		{
			names[i]=sn.nextLine();
		}
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(names[i].compareTo(names[j])>0)
				{
					temp=names[i];
					names[i]=names[j];
					names[j]=temp;
				}
			}
		}
		System.out.println("Sorted names are:");
		 for (i=0;i<n-1;i++)
		{	
		System.out.println(names[i]);	
		}
		System.out.print(names[n-1]);
	}
}
