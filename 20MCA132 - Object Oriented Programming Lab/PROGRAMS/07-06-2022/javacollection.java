import java.util.*;
class javacollection{
	public static void main(String args[])
	{
	ArrayList<String> list = new ArrayList<String>();
	list.add("Vijay");
	list.add("Ravi");
	list.add("ajay");
	
	Iterator itr=list.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
}
}