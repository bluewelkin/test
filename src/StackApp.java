class StackX
{
	private int maxSize;
	private long[] stackArray;
	private int top; 
    public StackX(int s)
    {
	maxSize=s;
	stackArray=new long[maxSize];
	top =-1;
    }
    public void push(long j) //put item on top of stack
    {
	 stackArray[++top]=j;
     }
 public long pop()
{
	return stackArray[top--];
}
public long peek()
{
	return  stackArray[top];
}
public boolean isEmpty()
{
	return(top==-1);
}
public boolean isFull()
{
	return(top==maxSize-1);
 }
}
public class StackApp
{
	public static void main(String[] args)
	{
		StackX theStack=new StackX(10);
		theStack.push(20);
		theStack.push(40);
		theStack.push(60);
		theStack.push(80);
		theStack.push(100);	
		while(!theStack.isEmpty())
		{
			long value=theStack.pop();
			System.out.println(value);
			System.out.println(" ");
		}// end while
		System.out.print("");		
	} //end main()
	
}

