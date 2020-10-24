
public class mergeSort {
	void merge(int arr[], int start, int mid, int end)  
	{  
	//find sizes of two subarrays to be merged
	int l = mid - start + 1;   //arr.length/2
	int r = end - mid;  	//arr.length - l
	int n = arr.length;
	
	if(n<2) //base case for sublist
		return;
	
	// temp array para sa pinaghiwalay
	int LeftArray[] = new int [l];  
	int RightArray[] = new int [r];  
	
	// put elements to temp arrray
	for (int i=0; i<l; ++i)  
		LeftArray[i] = arr[start + i]; // arr[i]
	  
	for (int j=0; j<r; ++j)  
		RightArray[j] = arr[mid + 1 + j];  // arr[l + j]
	
	//to print elements
//	for(int arr: LeftArray)
	
	
	// sort sub array  
	int i = 0, j = 0; //indexes of new subarray  	
	int k = start; // index of of array
	
	while (i<l && j<r)  {
		if (LeftArray[i] <= RightArray[j])  {  //comparing elements to sort 
			arr[k] = LeftArray[i];  		// if true left index increment and right index remains vice versa
			i++;  
		}  
		else  {  
			arr[k] = RightArray[j];  
			j++;  
		}  
		k++;  // move to next index to be replace
	}  
	
	
	// kapag naubos na laman ng isang sub array
	while (i < l)  {  
		arr[k] = LeftArray[i];  
		i++;  
		k++;  
	}  
	  
	while (j<r)  {  
		arr[k] = RightArray[j];  
		j++;  
		k++;  
	}  
} 
	
	//recursive call
	//use to merge subarrays/ sublist
	void sort(int arr[], int start, int end)  
	{  
		if (start < end)  {  
			int mid = (start + end)/2; //find mid  
			sort(arr, start, mid);  //sort left
			sort(arr , mid+1, end);  //sort right
			merge(arr, start, mid, end);  //original call
		}  
	}  
	
	
}
	
