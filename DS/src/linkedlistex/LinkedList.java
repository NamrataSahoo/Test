package linkedlistex;

public class LinkedList {
	Node startNode;
	//private Node endNode;
	
	public LinkedList()
	{
		startNode=null;
		//endNode= null;
	}
	public boolean isEmptyLinkedList()
	{
		if(startNode == null)
		{
			return true;
		}
		return false;
	}

	public void insertAtStart(int val) {
		Node newNode= new Node(val,null);
		if(startNode == null)
		{
			startNode = newNode;
		}
		else
		{
			newNode.setNext(startNode);
			//newNode.next= startNode;
			startNode = newNode;
		}
			
	}
	
	public void insertAtEnd(int val)
	{
		Node newNode= new Node(val, null);
		Node cureNode; //= new Node();
		if(startNode == null)
		{
			startNode= newNode;
		}
		else
		{
		cureNode=startNode;
		while(cureNode.next != null)
		{
			cureNode= cureNode.getNext();
		}
		cureNode.next= newNode;
		newNode.next=null;
		
		}
	}
	
	public void insertAtPos(int val, int x)
	{
		Node newNode = new Node(val, null);
		Node xNode;
		
		xNode=startNode;
		int count=0;
		while(count != x-1)
		{
			xNode= xNode.next;
			count++;
		}
		newNode.next=xNode.next;
		xNode.next=newNode;
		
	}
	public void printList()
	{
		System.out.println("inside printlist");
		Node currentNode= startNode;
		while(currentNode !=null)
		{
			System.out.println(currentNode.data);
			//currentNode = currentNode.getNext();
			currentNode = currentNode.next;
		}
		
	}
	public void sizeofLinkedlist()
	{
		Node currentNode= startNode;
		int size= 0;
		while(currentNode != null)
		{
			currentNode= currentNode.next;
			size++;
			
		}
		System.out.println(size);
	}
	
	
	public Node reverseLinkedListInternal(Node starNode)
	{
		System.out.println("Inside reverse linked list starting with " + starNode.data);
		
		if(starNode.next == null)
		{
			System.out.println("one element list");
			return starNode;
		}
		else
		{
			System.out.println("starNode data " + starNode.data);
			Node reverseNode = reverseLinkedListInternal(starNode.next);
			System.out.println("reverseNode start" + reverseNode.data);
			Node iterator = reverseNode;
			while(iterator.next != null)
			{
				iterator=iterator.next; 
			}
			System.out.println("after traversing reverseNode data " + iterator.data);
			starNode.next= null;
			iterator.next=starNode;
			return reverseNode;
		}
		
	}

	public void reverseLinkedList()
	{
		reverseLinkedListInternal(startNode);
	}
	public Node middleElement()
	{
		Node currentNode= startNode;
		Node middleNode= new Node();
		int size= 0;
		while(currentNode != null)
		{
			currentNode= currentNode.next.next;
			middleNode=middleNode.next;
			size++;
			
		}
		System.out.println(middleNode.toString());
		return middleNode;
		
	}
}
