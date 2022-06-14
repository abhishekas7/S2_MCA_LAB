
import java.util.*;
class tryex {
	public static void main(String arg[])
	{
		
		int a=10,b=5,c;
	try{
		c=a/b;
	}
	catch(Exception e){
		System.out.println(e.getMessage());
	}
	finally{
			System.out.println("final block");
	}}

}
