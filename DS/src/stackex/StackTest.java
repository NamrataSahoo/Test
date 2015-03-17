package stackex;


public class StackTest {
	public static void main(String[] args) {
	
		Stack s= new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
	s.print();
	s.pop();
	s.print();
	s.peek();
}
}
