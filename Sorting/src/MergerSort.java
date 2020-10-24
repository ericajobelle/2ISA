
public class MergerSort {

	public static void main(String[] args) {
		int arr[] = {12,11,13,7,5,6};  
		mergeSort ob = new mergeSort();  
		ob.sort(arr, 0, arr.length-1);
		  
		System.out.println("\nSorted array");  
		
		for(int i =0; i<arr.length;i++)  
		{  
		    System.out.println(arr[i]+"");  
		}  
	/*	mergeSort(arr);
		for(int num: nums) {
			System.out.println(num + "");
		} */
	}  
}

