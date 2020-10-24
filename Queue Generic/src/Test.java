
public class Test {

	public static void main(String[] args) {
		QueueGeneric q = new QueueGeneric(10); // create queue object
		
		Vehicle v1 = new Vehicle("Gray", "Toyota"); // creeate vehivle object
		Vehicle v2 = new Vehicle("Red", "Mitsubishi");
		Vehicle v3 = new Vehicle("Blue", "Nissan");
		
		q.enqueue(v1);
		q.enqueue(v2);
		q.enqueue(v3);
		
		
		System.out.println(q.peek());

	}

}
