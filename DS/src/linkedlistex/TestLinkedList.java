package linkedlistex;

public class TestLinkedList {
	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
	
		linkedList.insertAtStart(10);
		linkedList.insertAtStart(20);
		linkedList.insertAtStart(30);
		linkedList.insertAtStart(40);
		linkedList.printList();
		linkedList.insertAtEnd(50);
		linkedList.printList();
		linkedList.insertAtPos(60, 1);
		linkedList.printList();
		linkedList.middleElement();
		linkedList.sizeofLinkedlist();
		linkedList.reverseLinkedList();
		linkedList.printList();
		
	}

}
