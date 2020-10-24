
public class Test {

	public static void main(String[] args) {
		String [] students = {"eca", "mat", "jors", "hannah", "sage"};
		double [] avgs = {74.5, 86.9, 91.5, 79.4, 91.6}; 
		
		System.out.println("The topnotcher is " + Topnotcher.getTop(students, avgs));

	}

}
