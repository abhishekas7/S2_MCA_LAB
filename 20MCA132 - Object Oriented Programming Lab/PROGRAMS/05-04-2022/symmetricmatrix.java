import java.util.*;
class symmetricmatrix{
public static void main(String args[])
	{
	
	int [][] a=new int[50][50];
	int [][] b=new int[50][50];
	int [][] c=new int[50][50];
	int i,j;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the no of rows : ");

	int n=sc.nextInt();
	
	System.out.println("Enter the no of cols : ");
	int m=sc.nextInt();
	
	System.out.println("Enter the Matrix Elements : ");
	for (i=0;i<n;i++)
	{
		for (j=0;j<m;j++)
		{
		 a[i][j]=sc.nextInt();
		
		}
		
	}
	
	int f=0;
	for (i=0;i<n;i++)
	{
		for (j=0;j<m;j++)
		{
		 if(a[i][j]!=a[j][i])
		 {
		 f=1;
		 }
		}	
	}
	
	if(f==1)
		{
		System.out.println("Not Symmetric");
		}
		else
		{
		System.out.println("Symmetric");
		}
	
}
}
