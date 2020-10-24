
public class Test {

	public static void main(String[] args) {
		Queue q = new Queue(10);
	
		
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(5);
		q.enqueue(6);
		q.enqueue(7);
		q.enqueue(8);
		q.enqueue(9);
		q.enqueue(10);
		
		
	
		q.dequeue();	
		q.enqueue(11);
		
		System.out.println(q.peek());
		


	}

}
