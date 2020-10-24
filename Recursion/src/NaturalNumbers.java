import java.util.HashSet;

public class NaturalNumbers {
	static HashSet<Integer> natNos = new HashSet(); //wrapclass
	
	static void includeNumber(int n) {
		if(n == 0) {
			natNos.add(n); //add to set
		}else if(n-1 == 0||n-1> 0) {
			natNos.add(n);
			includeNumber(n-1);
		}else {
			System.out.println(n + " is not a natural number");
		}
	}
}
