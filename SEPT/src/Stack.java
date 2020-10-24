
public class Stack {
	//new
	
	int [] container;
	int top;
	
	Stack(int size){
		container = new int[size];
		top = -1; //mark on array that it does not contain anything
					//top is the index of the item
	}
	
	//clear
	
	void clear() {
		top = -1;
	}
	
	// empty
	boolean isEmpty() {
		if(top == -1) return true;
			return false;
	}
	
	//n-1 = top item
	boolean isFull() {
		if(top == container.length-1) return true;
		return false;
	}
	
	//push - lalagay ng item sa stack
	void push(int item) {
		top++;
		container[top] = item;
	}	
	//pop 
	int pop() {
		int temp = container[top];
		top--;
		return temp;
		
	}
	
	int peek() {
		return container[top];
	}
		
		
	}



