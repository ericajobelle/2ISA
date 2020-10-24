
public class METHOD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodA(5);
	}
	public static int methodA(int n) {

		 int num=n; 

		 if(n==1) {

		 return 1; 

		 }else { 

		while(n != 2) { 

		num = num * (n-1);

		n--; 

		} 

		return num; 

		} 

		}  
}
