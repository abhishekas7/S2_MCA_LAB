import java.util.ArrayDeque;
import java.util.Deque;

public class Dequea
{
	
	public static void main (String args[])
	{
		Deque<Integer> deque=new ArrayDeque<Integer>();
		deque.add(10);
		System.out.println("10 aded");
		deque.add(6);
		deque.add(7);
		System.out.println("Inserting 3 Element");
		for(Integer integer:deque)
		{
			System.out.println(integer);
		}
		deque.add(10);
		deque.addFirst(3);
		deque.addLast(2);
		deque.push(7);
		deque.offer(23);
		
		System.out.println(deque + "\n");
		deque.removeFirst();
		deque.removeLast();
		System.out.println("Deque after removing "+ "last and last:"+deque);
		deque.pop();
		System.out.println("After popping"+deque);
		
		for(Integer integer:deque)
  {
   System.out.println(integer);
  }
  deque.remove(7);
   System.out.println("Removing the element 7: " +deque);
  }
}
