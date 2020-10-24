
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list = new LinkedList<>();
		
		list.insertAtEnd("one");
		list.insertAtEnd("two");
		list.insertAtEnd("three");
		
		list.insertAtStart("four");
		
		list.insertAt(2, "five");
		
	//	list.deleteAtHead();
		
	//	list.deleteAt(0);
		
		list.display();
	}

}
