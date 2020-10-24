
public class Test {

	public static void main(String[] args) {
		int[] nums = {2,7,4,1,5,3};
		insertionSort(nums);
	 for(int num: nums) {
			System.out.print(num + " "); 
		
		} 

}
	static void selectionSort(int[] A) {
		for(int i = 0; i < A.length-1; i++) {
			int min = i; 
			for(int j = i+1; j < A.length; j++) { // iterating over unsorted part
				if(A[j] < A[min]) {
					min = j;
				}
			}
			int temp = A[i]; //swapping
			A[i] = A[min];
			A[min] = temp;
			
		}
	}
	
	static void bubbleSort(int [] A) {
		for(int i = 1; i<A.length; i++) {
			for(int j =1; j < A.length; j++) {
				if(A[j] < A[j-1]) { // kaliwa -1
					int temp = A[j];
					A[j] = A[j-1];
					A[j-1] = temp;
				}
			}
		}
	}
	
	static void insertionSort(int [] A) {
		for(int i = 0; i<A.length-1; i++) {
			for(int j =i; j >= 0; j--) {
				if(A[j] > A[j+1]) { // kaliwa -1
					int temp = A[j];
					A[j] = A[j+1];
					A[j+1] = temp;
				}
			}
		}
	}
}
