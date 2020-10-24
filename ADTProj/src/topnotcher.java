
public class topnotcher {
	String[] names;
	double[] grades;
	
	
	static String getTop(String[] names, double[] grades) {
		int ixMax = 0;
		for(int i=1; i<grades.length; i++) {
			if(grades[i] > grades[ixMax]) {
				ixMax = i;
			}
		}
		return names[ixMax];
	}
}
