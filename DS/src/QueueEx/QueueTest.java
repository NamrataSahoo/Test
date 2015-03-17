package QueueEx;

public class QueueTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q= new Queue();
		q.insertQueue(10);
		q.insertQueue(20);
		q.insertQueue(30);
		q.insertQueue(40);
		q.print();
		q.removeQueue();
		q.print();
		q.insertQueue(50);
		q.insertQueue(60);
		q.print();

	}

}
