import java.util.Scanner;

public class KadaneAlgorithm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println("Max Sum of the subarray: "+subArraySum(arr));
    }
    public static long subArraySum(int[] arr){
        long maxSum = arr[0];
        long curSum = arr[0];
        for(int i =0; i<arr.length; i++){
            curSum = Math.max(arr[i], arr[i] + curSum);
            maxSum = Math.max(maxSum, curSum);
        }
        if(maxSum <0){
            return 0;
        }
        return maxSum;
    }
}
