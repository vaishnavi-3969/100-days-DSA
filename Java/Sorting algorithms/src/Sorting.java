
public class Sorting {
	public void bubbleSort(int[] arr) {
		boolean isSwapped;
		int pass = 1;
		int n = arr.length;
		for(int i =0; i<n-1; i++) {
			isSwapped = false;
			for(int j=0; j<n-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					isSwapped = true;
				}
				
			}
			System.out.print("Pass "+pass+": ");
			pass++;
			display(arr);
			if(isSwapped==false) break;
		}
	}
	public void insertionSort(int[] arr) {
		for(int i =1; i<arr.length; i++) {
			int temp = arr[i];
			int j = i - 1;
			while(j>=0 && arr[j] > temp) {
				arr[j+1] = arr[j];
				j = j-1;
			}
			arr[j+1] = temp;
		}
	}
	public static void display(int[] arr) {
		for(int i =0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public void selectionSort(int[] arr) {
		//takng the min element and adding it to sorted part of the array
		for(int i =0; i<arr.length - 1; i++) {
			//assume that first element is the minimum element
			int min = i;
			for(int j = i+1; j<arr.length; j++) {
				if(arr[j] < arr[min]) {
					min = j;
				}
			}
			//swap minimum and i
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
	}
	public int[] merge2SortedArrays(int[] arr1, int[] arr2) {
		int[] result = new int[arr1.length + arr2.length];
		int ptr1 = 0, ptr2=0;
		int j = 0;
		while(ptr1 <arr1.length && ptr2 < arr2.length) {
			if(arr1[ptr1] < arr2[ptr2]) {
				result[j] = arr1[ptr1];
				ptr1++;
			}else {
				result[j] = arr2[ptr2];
				ptr2++;
			}
			j++;
		}
		while(ptr1 <= arr1.length-1) {
			result[j] = arr1[ptr1];
			ptr1++;
			j++;
		}
		while(ptr2 <= arr2.length-1) {
			result[j] = arr2[ptr2];
			ptr2++;
			j++;
		}
		display(result);
		return result;
	}
	public void mergeSort(int[] arr) {
		int[] temp = new int[arr.length];
		sort(arr,temp,0,arr.length-1);
		System.out.println("Merge sort: ");
		display(arr);
	}
	
	private void sort(int[] arr, int[] temp, int low, int high) {
		if(low < high) { //base case
			int mid = low + (high - low)/2; //overflow condition: (low+high)/2
			sort(arr,temp,low, mid); //sort left subarray
			sort(arr,temp,mid+1,high); //sort right subarray
			merge(arr,temp,low,mid,high);
		}
	}
	private void merge(int[] arr, int[] temp, int low, int mid, int high) {
		for(int i =low; i<=high; i++) {
			temp[i] = arr[i];
		}
		int i = low; //traverse left subarray
		int j = mid+1; //traverse right subarray
		int k = low; //merge both arrays into original array
		while(i<=mid && j<=high) {
			if(temp[i] <= temp[j]) {
				arr[k] = temp[i];
				i++;
			}else {
				arr[k] = temp[j];
				j++;
			}
			k++;
		}
		//copy the remaining elements of left subarray(if any)
		while(i <= mid) {
			arr[k] = temp[i];
			i++;
			k++;
		}
	}
	///dutch flag algorithm
	public void dutchFlagAlgorithm(int[] arr) {
		int i =0, j=0, k=arr.length-1;
		while(i<=k) {
			if(arr[i]==0) {
				swap(arr,i,j);
				i++;
				j++;
			}else if(arr[i]==1) {
				i++;
			}else if(arr[i]==2) {
				swap(arr,i,k);
				k--;
			}
		}
	}
	private void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
	}
	private void quickSort(int[] arr) {
		quick(arr,0,arr.length-1);
	}
	private void quick(int[] arr, int low, int high) {
		if(low<high) {
			int p = partition(arr,low,high);
			quick(arr,low,p-1);
			quick(arr,p+1,high);			
		}
		
	}
	private int partition(int[] arr,int low, int high) {
		int pivot = arr[high];
		int i=low,j=low;
		while(i<=high) {
			if(arr[i] <=pivot) {
				swap(arr,i,j);
				j++;
			}
			i++;
		}
		return j-1;
	}
	//given an integer array in ascending order, return an array of square of each no. sorted in ascending order
		public int[] sortedSquare(int[] arr) {
			int n = arr.length; 
			int[] result = new int[n];
			int i =0,j=n-1;
			for(int k =n-1; k>=0; k--) {
				if(Math.abs(arr[i]) > Math.abs(arr[j])) {
					result[k] = arr[i] * arr[i];
					i++;
				}else {
					result[k] = arr[j] * arr[j];
					j--;
				}
			}
			display(result);
			return result;
		}
		
		//given sorted arr of integers, rearrange in such a way that the first position will have the largest no. , the second will have the smallest, the third will have second largest, and so on. using o(1) extra space
		public int[] rearrangeSortedArrInMaxMin(int[] arr) {
			int[] temp = new int[arr.length];
			int i = 0, j=arr.length-1,k=0;
			for(int z=0; z<arr.length; z++) {
				if(z%2==0) {
					temp[k] = arr[j];
					j--;
				}else {
					temp[k] = arr[i];
					i++;
				}
				k++;
			}
			display(temp);
			return temp;
		}
	public static void main(String[] args) {
		int[] arr = {4,6,2,6,2,7,2};
		Sorting sorting = new Sorting();
		sorting.bubbleSort(arr);
		display(arr) ;
		int[] arr1 = {1,5,7,3,2,6,8,9};
		sorting.insertionSort(arr1);
		System.out.println("arr1: ");
		display(arr1);
		int[] arr2 = {3,5,2,6,1};
		sorting.selectionSort(arr2);
		System.out.println("arr2: ");
		display(arr2); 
		System.out.println("Merge arr1 and arr2: ");
		sorting.merge2SortedArrays(arr1, arr2);
		int[] arr3 = {3,5,6,2,6,2,6,1};
		sorting.mergeSort(arr3); 
		System.out.println("Dutch Flag algorithm: ");
		int[] arr4 = {1,0,2,1,2,1,2,0,0};
		sorting.dutchFlagAlgorithm(arr4);
		display(arr4);
		int[] arr5 = {5,2,6,7,3,7,2,5};
		System.out.println("Quick Sort: ");
		sorting .quickSort(arr5);
		display(arr5);
		System.out.println("Sorted square: ");
		int[] arr6 = {-7,-3,0,5,6,7};	
		sorting.sortedSquare(arr6);
		int[] arr7 = {1,2,3,4,5,6,7};
		System.out.println("Rearrange sorted array in max/min form: ");
		sorting.rearrangeSortedArrInMaxMin(arr7);
	}
}
