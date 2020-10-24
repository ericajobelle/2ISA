
public class Stack2 <T> {//generic <>   //refactor to  rename
	//new
	
	T [] container;
	int top;
	Stack2(int size){
		container = (T[]) new Object [size];
		top = -1;
		
	}
	
	//clear
	
	void clear() {
		top = -1;
	}
	
	// empty
	boolean isEmpty() {
		if(top == -1) 
			return true;
		return false;
	}
	
	//n-1 = top item
	boolean isFull() {
		if(top == container.length-1) return true;
		return false;
	}
	
	//push - lalagay ng item sa stack
	void push(T item) {
		top++;
		container[top] = item;
	}	
	//pop 
	T pop() {
		T temp = container[top];
		top--;
		return temp;
		
	}
	
	T peek() {
		return container[top];
	}
		
		
	}




