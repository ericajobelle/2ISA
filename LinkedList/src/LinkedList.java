
public class LinkedList <T>{
	Node head;
	
	LinkedList(){
		head = null;
	}
	
	boolean isEmpty() {
		if(head==null) return true;
		return false;
	}
	
	int getSize() {
		int size = 0;
		for(Node iNode = head; iNode != null; iNode= iNode.next) {
			size++; // as iterating size is creasing
		}
		return size; //size is dynamic
	}
	
	
	void insertAtEnd(T data) {
		Node nodeObj = new Node(data);
		if (isEmpty()) {
			head= nodeObj;
		}else {
			Node iNode;
			for (iNode = head; iNode.next != null; iNode = iNode.next) {
				
			}
			
			iNode.next = nodeObj; 
		}
	}
	
	void insertAtStart(T data) {
		Node nodeObj = new Node(data);
		if(isEmpty()) {
			head = nodeObj;
		}else {
			nodeObj.next = head;
			head = nodeObj;
		}
	}
	
	
	void insertAt(int index, T data) {
		Node nodeObj = new Node(data);
		
		if (index == 0) {
			insertAtStart(data);
			return;
		}
		
		Node iNode = head;
		
		for (int i = 0; i < getSize(); i++) {
			if(i == index) {
				nodeObj.next = iNode.next;
				iNode.next = nodeObj;
				break;
			}
			
			iNode = iNode.next; 
		}
	}
	
	void deleteAtHead() {
		head = head.next;
	}
	
	void deleteAt(int index) {
		Node iNode = head; //assigning iterating variable
		
		if(index == 0) {
			deleteAtHead();
			return;
		}
		for(int i = 0; i < getSize(); i++) {
			if (i  == index-1) {
				iNode.next = iNode.next.next;
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
