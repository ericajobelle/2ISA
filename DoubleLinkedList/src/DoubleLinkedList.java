
public class DoubleLinkedList <T>{
	Node head;
	Node tail;
	
	DoubleLinkedList(){
		head = null;
		tail = null;
	}
	
	boolean isEmpty() {
		if (head == null && tail == null) return true;
		return false;
	}
	
	
	int getSize() {
		int size = 0;
		for(Node iNode = head; iNode != null; iNode= iNode.next) {
			size++; // as iterating size is creasing
		}
		return size; //size is dynamic
	}
	
	
	void addAtStart( T data) {
		Node nodeObj = new Node(data);
		if(isEmpty()) {
			head = nodeObj;
			tail = nodeObj;
			return;
		}else {
			nodeObj.next = head;
			head.prev = nodeObj;
			head = nodeObj;
		}
	}
	
	void addAtEnd(T data) {
		Node nodeObj = new Node(data);
		if(isEmpty()) {
			head = nodeObj;
			tail = nodeObj;
			return;
		}else {
			tail.next = nodeObj;
			nodeObj.prev = tail;
			tail = nodeObj;
		}
	}
	
	void insertAt(int pos, T data) {
		Node nodeObj = new Node(data);
		
		if (pos == 0) {
			addAtStart(data);
		}else {
		
		Node iNode = head;
		
		for (int i = 0; i < getSize(); i++) {
			if(i == pos-1) {
				nodeObj.next = iNode.next;
				iNode.prev = iNode;
				
				iNode.next = nodeObj;
				iNode.next.prev = nodeObj;
			}
			
			iNode = iNode.next; 
		}
	}
}
	
	void deleteAtHead() {
		head = head.next;
		head.prev =null;
		
	}
	
	void deleteAtTail() {
		tail = tail.prev;
		tail.next = null;
		
	}
	
	void deleteAt(int pos) {
		Node iNode = head;
		
		if(pos == 0) {
			deleteAtHead();
			return;
		}
		
		if (pos == getSize()-1) {
			deleteAtTail();
			return;
		}
		
		for(int i = 0; i<getSize(); i++) {
			if(i == pos-1) {
				iNode.next = iNode.next.next;
				iNode.next.prev =iNode;
				
			}
			
			iNode = iNode.next;
		}
	}
	public void display() {
		for(Node iNode = head; iNode !=null; iNode=iNode.next) {
			System.out.println(iNode.data + " ");
		}
	}
}
