package linkedlistex;

public class Node {
	protected int data;
	protected Node next;
	public Node()
	{
		data=0;
		next=null;
	}
	public Node(int data,Node next)
	{
		this.data=data;
		this.next = next;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	
}