
public class HashNode {
	Integer key; //can be generic
	String value; //can be generic
	public HashNode next; //ref to next hashnode
		
	public HashNode(Integer key, String value) {
		this.key = key;
		this.value = value;
		this.next = null;
	}
}
