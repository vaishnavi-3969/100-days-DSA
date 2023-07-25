
public class Search {
	///returns index
	public int linearSearch(int[] arr, int key) {
		for(int i =0; i<arr.length; i++) {
			if(arr[i] == key) {
				return i;
			}
		}
		return -1;
	}
	public int binarySearch(int[] arr, int key) {
		int low = 0;
		int high = arr.length - 1;
		while(low <= high) {
			int mid = (low+high)/2;
			if(arr[mid] == key) {
				return mid;
			}
			if(arr[mid] < key) {
				high = mid - 1;
			}else {
				low = mid+1;
			}
		}
		return -1;
	}
	//given an array in sorted order and target element, if the element is present returns it's index else the position of where it should be included
	public int searchInsert(int[] arr, int target) {
		int low = 0;
		int high = arr.length - 1;
		while(low <= high) {
			int mid = low + (high - low)/2;
			if(arr[mid] == target) return mid;
			if(target < arr[mid]) {
				high = mid - 1;
			}else {
				low = mid + 1;
			}
		}
		return low;
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		Search search = new Search();
		System.out.println("Linear Search: "+search.linearSearch(arr, 4));
		System.out.println("Binary Search: " + search.binarySearch(arr, 3));
		System.out.println("Search in sort: "+search.searchInsert(arr, 10));
	}
}
