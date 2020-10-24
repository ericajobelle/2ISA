
public class quickSort {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,6,8,9};
		quicksort(nums, 0, nums.length-1);
		for(int num: nums) {
			System.out.println(num + " ");
		}

	}
	static private void quicksort(int[] unsorted, int start, int end) {
		if(start<end) { // base case
			int ip = particition(unsorted, start, end);
			quicksort(unsorted, start, ip-1); //left
			quicksort(unsorted, ip+1, end); //right
		}
	}
//partitioning
	static int particition(int[] unsorted, int start, int end) {
		int pivot = unsorted[end];
		int ip = start;
		for(int i =start; i < end; i++) {
			if(unsorted[i] <= pivot) {
				int temp = unsorted[i];
				unsorted [i] = unsorted [ip]; // sorting
				unsorted [ip] = temp;
				ip++;
			}
		}
		int temp = unsorted[end]; // pivot
		unsorted[end] = unsorted[ip];
		unsorted[ip] =temp; //sorting
		
		return ip;
	}
	
}
