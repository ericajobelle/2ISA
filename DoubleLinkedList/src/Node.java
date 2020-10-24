
public class Node <T> {
	Node prev;
	T data;
	Node next;
	
	Node( T data){
		this.data = data;
		prev = null;
		next = null;
	}
}
