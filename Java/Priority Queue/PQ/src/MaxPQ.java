public class MaxPQ {
	private Integer[] heap;
	private int n; //size of max heap

	public MaxPQ(int capacity) {
		heap = new Integer[capacity + 1];
		n = 0;
	}

	public boolean isEmpty() {
		return n == 0;
	}

	public int size() {
		return n;
	}

	public static void main(String[] args) {
		MaxPQ pq = new MaxPQ(3);
		System.out.println(pq.size());
		System.out.println(pq.isEmpty());
		pq.insert(4);
		pq.insert(5);
		pq.insert(2);
		pq.insert(6);
		pq.insert(1);
		pq.insert(3);
		System.out.println(pq.size());
		pq.display();
	}
	public void insert(int x) {
		if(n==heap.length - 1) {
			resize(2*heap.length);
		}
		n++;
		heap[n] = x;
		swim(n);
	}

	private Integer[] resize(int i) {
		Integer[] newHeap = new Integer[i];
		for(int i1 =0; i1<heap.length; i1++) {
			newHeap[i1] = heap[i1];
		}
		heap = newHeap;
		return heap;
	}

	public void display() {
		System.out.println("Heap: ");
		for(int i =1; i<=n; i++) {
			System.out.print(heap[i] + " ");
		}
		System.out.println();
	}
	private void swim(int k) {
		while(k>1 && heap[k/2] < heap[k]) {
			int temp = heap[k];
			heap[k] = heap[k/2];
			heap[k/2] = temp;
			k = k/2;
		}
	}

}