package stackex;


public class Stack {
	protected int stackArray[] = new int[10];
	protected int top=-1;
	protected static final int size=10;
	void push(int i)
	{
		if(top <= size-1)
		{
			top=top+1;
			stackArray[top]=i;
			System.out.println("pushed element" + stackArray[top]);
		}
	}
		
	void pop()
	{
		if( top >=0 )
		{
			System.out.println("popped element" + stackArray[top]);
			top=top-1;
			
			
		}
		else
		{
			System.out.println("no element to pop");
		}
		
	}
	int peek()
	{
		System.out.println("top" + stackArray[top]);
		return stackArray[top];
	}
	void print()
	{
		if(top>=0)
		{
		for(int i=0; i<=top ; i++)
			System.out.println(stackArray[i]);
		}
	}


	}
