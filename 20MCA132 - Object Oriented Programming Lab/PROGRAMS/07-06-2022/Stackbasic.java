import java.util.Stack;
public class Stackbasic
{
    public static void main(String args[])
    {
        Stack<Integer> stk=new Stack<>();
        boolean result=stk.empty();
		stk.push(78);
		stk.push(133);
		stk.push(90);
		stk.push(100);
		System.out.println("Elements in Stack" + stk);
		result=stk.empty();
		popelmnt(stk);
        System.out.println("Is the stack empty?" +result);
    }
	
	static void popelmnt(Stack stk)
	{
		System.out.print("pop->");
		Integer x =(Integer)stk.pop();
		System.out.println(x);
		System.out.println("stack :" + "stk");
	}
	
}