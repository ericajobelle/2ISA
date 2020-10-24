
public class Test {

	public static void main(String[] args) {
	/*	Stack stack =  new Stack(25); //stack line 6 -8 ; capacity
		
	
	 	stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		stack.push(7);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	
		System.out.println("top of stack: " + stack.peek());
		System.out.println("stack empty: " + stack.isEmpty());
		System.out.println("stack full: " + stack.isFull());
	
	*/
	//Stack2	
	/*	String str = "Hello 2ISA!";
		char[] tokens = str.toCharArray();
		for( char x : tokens) { // print str 
			System.out.println(x);
		} 
		
		Stack2<Character> stack = new Stack2<>(20);
		for(Character c: tokens) {
			stack.push(c);
		}
		//print reverse kasi pag pop yung asa top mauuna maalis
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		
		
		Stack2<String> stack = new Stack2(25); //objects not primitive
		stack.push("apple");
		stack.push("oranges");
		stack.push("grapes");
		stack.push("melons");
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop()); */
		
		Stack2<Student> students = new Stack2<>(10);
		
		Student s1 = new Student("Juan", "Dela Cruz", 20);
		Student s2 = new Student("Pedro", "Morales", 18);
		Student s3 = new Student("Cynthia", "Garcia", 17);
		Student s4 = new Student("Mary", "Buenaventura", 14);
		
		students.push(s1);
		students.push(s2);
		students.push(s3);
		students.push(s4);
		
		System.out.println(students.pop().fname);
		System.out.println(students.pop().fname);
		System.out.println(students.pop().fname);
		System.out.println(students.pop().fname);
	}
}
