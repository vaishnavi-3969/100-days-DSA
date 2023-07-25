
public class Kadane {
	
	public static int maxArraySum(int[] arr) {
		int currentMax = arr[0];
		int maxSoFar = arr[0];
		for(int i =1; i<arr.length; i++) {
			currentMax += arr[i];
			if(arr[i] > currentMax) {
				currentMax = arr[i];
			}
			if(currentMax > maxSoFar) {
				maxSoFar = currentMax;
			}
		}
		return maxSoFar;
	}
	public static void main(String[] args) {
		int[] arr = {4,3,-2,6,-12,7,-1,6};
		System.out.print("Max. sum of the subarray is: "+maxArraySum(arr));
	}
}
