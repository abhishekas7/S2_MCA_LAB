import java.io.*;

class AgeException extends Exception{

AgeException(String s)
{
	super(s);
}
}
class Age{
   public static void main(String[] args) throws AgeException
    {
		
        int age = 20;
        
		if(age < 18)
		{
			throw new AgeException("Age is less than 18");
		}
		else{
			System.out.println("eligible");
		}
    }

}