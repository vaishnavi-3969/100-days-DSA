import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class ValidSubsequence {
	public static boolean isValidSubsequence(String str, String seq) {
		int i=0,j=0;
		while(i<str.length() && j<seq.length()) {
			if(str.charAt(i)==seq.charAt(j)) {
				j++;
			}
			i++;
		}
		return j==seq.length();
	}
	public static int firstNonRepeatingCharacter(String s) {
		Map<Character, Integer> map = new HashMap<>();
		char[] chars = s.toCharArray();
		for(char ch: chars) {
			map.put(ch, map.getOrDefault(ch,0)+1);
		}
		for(int i =0;i<chars.length; i++) {
			char ch = chars[i];
			if(map.get(ch)==1) {
				return i;
			}
		}
		return -1;
	}
	//remove vowels
	 public static String removeVowels(String str) {
		 Set<Character> vowels = Set.of('a','e','i','o','u');
		 StringBuilder sb = new StringBuilder();
		 char[] chars = str.toCharArray();
		 for(char c: chars) {
			 if(!vowels.contains(c)) {
				 sb.append(c);
			 }
		 }
		 return sb.toString();
	 }
	 // reverse an integer
	 public static int reverseInteger(int n) {
		 boolean isNegative = n<0;
		 if(isNegative) {
			 n *=-1;
		 }
		int reverse = 0;
		int lastDigit;
		while(n>0) {
			lastDigit = n%10;
			reverse = reverse*10 + lastDigit;
			n /=10;
		}
		return isNegative ? reverse*-1: reverse;
	 }
	 //remove all occurences in place - leetcode 27
	 public static int removeElement(int[] nums, int val) {
		 int i =0; 
		 for(int j =0; j<nums.length; j++) {
			 if(nums[i] != nums[j]) {
				 nums[i] = nums[j];
				 i++;
			 }
		 }
		 return i;
	 }
	 //Array is sorted in non-decreasing order, remove teh duplicates in place such that only unique elemenets appears only once. The relative order of the elements should be kept the same.
	 //return the no. of unique elements in nums
	public static int removeDuplicates(int[] arr) {
		Set<Integer> set = new HashSet<>();
		int unique=0;
		for(int i =0; i<arr.length; i++) {
			if(!set.contains(arr[i])) {
				unique++;
				set.add(arr[i]);
			}
		}
		return unique;
	}
	public static int removeDuplicatesMethod2(int[] arr) {
		int i =1;
		for(int j=1; j<arr.length;j++) {
			if(arr[j-1]!=arr[j]) {
				arr[i] = arr[j];
				i++;
			}
		}
		return i;
	}
	//3 sum problem
	//given an array of distinct integers, print all such triplets such that they add up to a specific target. The triplets should be ordered in ascending order

	public static void threeSum(int[] arr, int target) {
		for(int i =0; i<arr.length-2; i++) {
			int j = i+1;
			int k = arr.length-1;
			while(j<k) {
				if(arr[j]+arr[k]==target) {
					System.out.println("Sum with: "+arr[i] + ", "+arr[j] + ", "+arr[k]);
					j++;
					k--;
				}else if(arr[j]+arr[k] < target) {
					j++;
				}else {
					k--;
				}
			}
		}
	}
		//product of an array except self
	 public static int[] productOfAnArrayExceptItself(int[] arr) {
		 int[] result = new int[arr.length];
		 int temp = 1;
		 //iterate from left to right
		 result[0] = arr[0];
		 for(int i =1; i<arr.length; i++) {
			 result[i] = temp;
			 temp*= arr[i];
		 }
		 //iterate from right to left
		 temp = 1;
		 for(int i =arr.length-1; i>=0; i--) {
			 result[i] = result[i]*temp;
			 temp*=arr[i];
		 }
		 return result;
	 }
	 public static void display(int[] arr) {
		 for(int i =0; i<arr.length; i++) {
			 System.out.print(arr[i]+" ");
		 }
		 System.out.println();
	 }
	 //maximum sum subarrays of size k
	 public static int maxSubArraySum(int[] arr, int k) {
		 int maxSum = 0;
		 int windowSum = 0;
		 int start=0;
		 for(int end=0; end<arr.length; end++) {
			 windowSum = windowSum+arr[end];
			 if(end>=k-1) {
				 maxSum = Math.max(maxSum, windowSum);
				 windowSum = windowSum - arr[start];
				 start++;
			 }
		 }
		 return maxSum;
	 }
	 public static int maxSumSubArray(int[] arr,int k) {
		 int maxSum=0;
		 int windowSum=0;
		 int start=0;
		 for(int i =0; i<k; i++) {
			 windowSum+=arr[i];
		 }
		 for(int j=k; j<arr.length;j++) {
			 windowSum = windowSum+arr[j] - arr[start];
			 start++;
			 maxSum = Math.max(windowSum, maxSum);
		 }
		 return maxSum;
	 }
	 //leetcode 3: longest substring w/o repeating characters
	 public static int lengthOfLongestSubstring(String s) {
		 Map<Character, Integer> map = new HashMap<>();
		 int maxLength =0; 
		 int start = 0;
		 for(int end=0; end<s.length(); end++) {
			 char rightChar = s.charAt(end);
			 if(map.containsKey(rightChar)) {
				 start = Math.max(start, map.get(rightChar)+1);
			 }
			 map.put(rightChar, end);
			 maxLength = Math.max(maxLength, end-start+1);
		 }
		 return maxLength;	 
	}
	 
	public static void main(String[] args) {
		System.out.println("String ace is subsequence of 'abcde': "+isValidSubsequence("abcde","ace"));
		System.out.println("String aec is subsequence of 'abcde': "+isValidSubsequence("abcde","aec"));	
		System.out.println(firstNonRepeatingCharacter("racecars"));
		System.out.println(removeVowels("ice cream"));
		System.out.println(reverseInteger(-1234));
		System.out.println(removeElement(new int[]{0,1,2,2,-3,0,4,2},2));
		System.out.println(removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
		System.out.println(removeDuplicatesMethod2(new int[]{0,0,1,1,1,2,2,3,3,4}));
		threeSum(new int[]{0,1,2,3,4,7},6);
		int[] productExceptItself = productOfAnArrayExceptItself(new int[] {1,2,3,4});
		display(productExceptItself);
		System.out.println(maxSubArraySum(new int[] {2,7,3,5,8,1},3));
		System.out.println(maxSumSubArray(new int[] {2,7,3,5,8,1},3));
		System.out.println(maxSumSubArray(new int[] {2,7,3,5,8,1},1));
		System.out.println(lengthOfLongestSubstring("pwwkew"));
		
	}

}
