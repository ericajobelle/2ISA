
public abstract class Test {

	public static void main(String[] args) {
		String exp = "10 2 8 * + 3 - ";
		String exp2 = "- + 7 8 * 9 8";
		String exp3 = "* + A B + C D";
		String exp4 ="- + - 1 ^ 4 3 * 7 ^ 9 / 1 5 2";
		String exp5 ="A B + C * D E - F G + * -";
		String exp6 = "A B C * +";
		System.out.println(postfixEval(exp));
	//	System.out.println(prefixEval(exp2));
	//	System.out.println(prefixToInfix(exp3));
	//	System.out.println(prefixToPostfix(exp4));
	//	System.out.println(postfixToInfix(exp5));
	//	System.out.println(postfixToPrefix(exp6));

	}
	static int postfixEval(String postfixExp) {
		String[] strArray = postfixExp.split(" ");
		char[] tokens = new char[strArray.length];
		
		for(int i = 0; i < tokens.length; i++) { //put elements to char array
			tokens[i] = strArray[i].charAt(0);
					
		}
		
		Stack<Integer> stack = new Stack<>(20); //create new stack
		
		for(int i = 0; i<tokens.length; i ++) { //char array
			if(Character.isDigit(tokens[i])) {
				stack.push(Character.getNumericValue(tokens[i])); //being push is numeric value
			}else {
				int op2 = stack.pop();
				int op1 = stack.pop();
				switch(tokens[i]) {
				case '+' : stack.push(op1 + op2); break;
				case '-' : stack.push(op1 - op2); break;
				case '*' : stack.push(op1 * op2); break;
				case '/' : stack.push(op1 / op2); break;
				}
			}
		}
		return stack.peek();
	}
	
	static int prefixEval(String prefixExp) {
		String[] strArray = prefixExp.split(" ");
		char [] tokens = new char[strArray.length];
		
		for(int i = 0; i < tokens.length; i++) { //put elements to char array
			tokens[i] = strArray[i].charAt(0);
		}
		
		Stack<Integer> stack = new Stack<>(20);
		
		for(int i = tokens.length-1; i>=0; i--) {
			if(Character.isDigit(tokens[i])) {
				stack.push(Character.getNumericValue(tokens[i])); //being push is numeric value
			}else {			//.getnumber to get the numeric value from char
				int op1 = stack.pop();
				int op2 = stack.pop();
				switch(tokens[i]) {
				case '+' : stack.push(op1 + op2); break;
				case '-' : stack.push(op1 - op2); break;
				case '*' : stack.push(op1 * op2); break;
				case '/' : stack.push(op1 / op2); break;
				}
			}
		}
		return stack.peek();
	}
	
	static String prefixToInfix(String prefixExp) {
		String[] tokens = prefixExp.split(" ") ;
		Stack<String> stack = new Stack <>(20);
		
		for(int i = tokens.length-1; i>=0; i--) {
			if(isOperator(tokens[i])) {
				String op1 = stack.pop();	
				String op2 = stack.pop();
				stack.push("( " +  op1 + " " + tokens[i] + " " + op2 + ")");
			}else {
				stack.push(tokens[i]);
			}
		}
		return stack.peek();
	}
	static boolean isOperator(String token) { //to compare if char is an operand
		switch (token) {
		case "+" : 
		case "-" :
		case "*" :
		case "/" : return true;
		}
		return false;
	}
	
	static String prefixToPostfix(String prefixExp) {
		String[] tokens = prefixExp.split(" ") ;
		Stack<String> stack = new Stack <>(20);
		
		for(int i = tokens.length-1; i>=0; i--) {
			if(isOperator(tokens[i])) {
				String op1 = stack.pop();	
				String op2 = stack.pop();
				stack.push(op1 + " " + op2 + " " + tokens[i]);
			}else {
				stack.push(tokens[i]);
			}
		}
		return stack.peek();
	}
	
	static String postfixToInfix(String postfixExp) {
		String[] tokens = postfixExp.split(" ") ;
		Stack<String> stack = new Stack <>(20);
		
		for(int i = 0; i < tokens.length; i++) {
			if(isOperator(tokens[i])) {
				String op2 = stack.pop();	
				String op1 = stack.pop();
				stack.push("(" + op1 + " " + tokens [i] + " " + op2 + ")");
			}else {
				stack.push(tokens[i]);
			}
		}
		return stack.peek();
	}
	static String postfixToPrefix(String postfixExp) {
		String[] tokens = postfixExp.split(" ") ;
		Stack<String> stack = new Stack <>(20);
		
		for(int i = 0; i < tokens.length; i++) {
			if(isOperator(tokens[i])) {
				String op2 = stack.pop();	
				String op1 = stack.pop();
				stack.push(tokens[i] + " " + op1 + " " + op2);
			}else {
				stack.push(tokens[i]);
			}
		}
		return stack.peek();
	}
}
