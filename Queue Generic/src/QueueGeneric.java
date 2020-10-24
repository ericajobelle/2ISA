
public class QueueGeneric<T>{

	private T[] container;
	int front, back;
	
	QueueGeneric(int capacity){
		container = (T[]) new Object[capacity];
		front = -1;
		back = -1;
	}
	
	void clear() {
		front = -1;
		back = -1;
				
	}
	 
	boolean isEmpty(){
		if(front == -1 && back == -1) return true;
		else return false;
		}
		
	
	boolean isFull() {
		if(front ==(back+1) % container.length) return true; //circular array
	//	if(back == container.length-1) return true;
		return false;
	}
	
	void enqueue(T item) {
		if(isEmpty()) { 
			front = 0; back = 0;
			container[0] = item;
		}else if(isFull()) { 
			System.out.println("queue is full");;
		}else {
		//back++;	
			back = (back+1) % container.length; // rear = (rear + 1) % N ; circular array		
			container[back] = item;
		}
	}
	
	T dequeue() {
		if(isEmpty()) {
			return null;
		}else if (back == front) {
			T temp = container[front];
			clear();
			return temp;
		}else {
			T temp = container[front];
		//	front++; //front = (front + 1) % N
			front = (front + 1) % container.length;
			return temp;
		}
	}
	T peek() {
		if(isEmpty()) {
			return null;
		}else {
		return container[front];
		}
	}
}


