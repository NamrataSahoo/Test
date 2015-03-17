package QueueEx;

public class Queue {
	protected int queueArray[]= new int[10];
	protected static final int maxSize =10;
	int front;
	int rear=-1;
	//int size=10;

	void insertQueue(int element)
	{
		if(rear==maxSize)
		{
			System.out.println(" queue full");
		}
		else
		{
			rear=rear+1;
			queueArray[rear]=element;
			
			System.out.println("inserted element" + element);
		}
		
	}
	void removeQueue()
	{
		if(front==rear)
		{
			//no element
		}
		else
		{
			//rear=rear+1;
			System.out.println("removed element"+queueArray[front]); 
			front=front+1;
			
		}
		
	}
	void print()
	{
		if(front<=rear)
			{
				for(int i=front; i<=rear ; i++)
				{
					System.out.println("elements are"+ queueArray[i]);
				}
			}
		
	}
	
}
