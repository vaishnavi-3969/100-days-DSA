import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashTable {
	private HashNode[] buckets;
	private int size; //no. of key value pair in hash table or no. of hash nodes in table
	private int noOfBuckets; //capacity
	
	public HashTable() {
		this(10); //default capacity
	}

	public HashTable(int capacity) {
		this.noOfBuckets = capacity;
		buckets = new HashNode [noOfBuckets];
		this.size = 0;
	}
	public int size() {
		return size;
	}
	public boolean isEmpty() {
		return size==0;
	}
	public void put(Integer key, String value) {
	    if (key == null || value == null) {
	        throw new IllegalArgumentException("Key or value is null!");
	    }
	    int bucketIndex = getBucketIndex(key);
	    HashNode head = buckets[bucketIndex];
	    while (head != null) {
	        if (head.key.equals(key)) {
	            head.value = value;
	            return;
	        }
	        head = head.next;
	    }
	    size++;
	    head = buckets[bucketIndex];
	    HashNode node = new HashNode(key, value);
	    node.next = head;
	    buckets[bucketIndex] = node;
	}

	public int getBucketIndex(Integer key) {
		return key%noOfBuckets; //buckets.length
	}
	public String get(Integer key) {
		if(key==null) {
			throw new IllegalArgumentException("Key is null!");
		}
		int index = getBucketIndex(key);
		HashNode head = buckets[index];
		while(head!=null) {
			if(head.key == key) {
				return head.value;
			}
			head = head.next;
		}
		return null;
	}
	public String remove(Integer key) {
		int bucketIndex = getBucketIndex(key);
		HashNode head = buckets[bucketIndex];
		HashNode previous = null;
		while(head!=null) {
			if(head.key.equals(key)) {
				break;
			}
			previous = head;
			head = head.next;
		}
		if(head==null) {
			return null;
		}
		size--;
		if(previous!=null) {
			previous.next = head.next;
		}else {
			buckets[bucketIndex] = head.next;
		}
		return head.value;
	} 
	public static boolean containsDuplicate(int[] nums) {
		Set<Integer> set = new HashSet<>();
		for(int i=0; i<nums.length; i++) {
			if(set.contains(nums[i])) {
				return true;
			}
			set.add(nums[i]);
		}
		return false;
	}
	//given an array of integers, return indices of the 2 nos. such that they add up to a specific target.
	public static int[] twoSum(int[] arr, int target) {
		int[] result = new int[2];
		Map<Integer, Integer> map = new HashMap<>();
		for(int i =0; i<arr.length; i++) {
			if(!map.containsKey(target-arr[i])) {
				map.put(arr[i],i);
			}else {
				result[0] = i;
				result[1] = (int) map.get(target-arr[i]);
				return result;
			}
		}
		throw new IllegalArgumentException("Two nos. not found!");
	}
	//method 2 for above problem
	public static int[] twoSumMethod2(int[] arr, int target) {
		Arrays.sort(arr);
		int left = 0;
		int right=arr.length-1;
		int[] result = new int[2];
		while(left < right) {
			int sum = arr[left] + arr[right];
			if(sum == target) {
				result[0] = left;
				result[1] = right;
				return result;
			}else if(sum < target) {
				left++;
			}else {
				right--;
			}
		}
		return new int[0];
	}
	public static void main(String[] args) {
		HashTable table = new HashTable(10);
		table.put(105, "Tom");
		table.put(21, "Sana");
		table.put(21, "Harry");
		System.out.println(table.size());
		System.out.println(table.get(21));
		System.out.println(table.get(105));
		System.out.println(table.get(1));
		System.out.println(table.remove(21));
		int[] arr = {1,2,3,1,6};
		System.out.println("Contains duplicate: "+containsDuplicate(arr));
		int[] result = twoSum(arr,7);
		System.out.println("Result comes 7 from indices: "+result[0]+" and "+result[1]);
		int[] result2 = twoSumMethod2(arr,7);
		System.out.println("Result comes 7 from indices: "+result2[0] + " and "+result2[1]);
	}
}
