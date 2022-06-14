import java.util.*;
class mulmatrix{
public static void main(String args[])
	{
	
	int [][] a=new int[50][50];
	int [][] b=new int[50][50];
	int [][] c=new int[50][50];
	int i,j,k;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the no of rows : ");

	int n=sc.nextInt();
	
	System.out.println("Enter the no of cols : ");
	int m=sc.nextInt();
	
	System.out.println("Enter the 1st Array Elements : ");
	for (i=0;i<n;i++)
	{
		for (j=0;j<m;j++)
		{
		 a[i][j]=sc.nextInt();
		
		}
		
	}
	
	System.out.println("Enter the 2nd Array Elements : ");
	for (i=0;i<n;i++)
	{
		for (j=0;j<m;j++)
		{
		 b[i][j]=sc.nextInt();
		
		}
		
	}
	

	for (i=0;i<n;i++)
	{
		for (j=0;j<m;j++)
		{
		 for(k=0;k<m;k++)
		 {
		 c[i][j]=c[i][j]+(a[i][j]*b[i][j]);
		 }
		
		}
		
	}
	
	System.out.println("Multiplication of Two Array Elements : ");
	for (i=0;i<n;i++)
	{
		for (j=0;j<m;j++)
		{
		 System.out.print(c[i][j]+"\t");
		
		}
		System.out.println();
		
	}
	
}
}
