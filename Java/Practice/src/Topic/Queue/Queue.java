package Topic.Queue;

public class Queue {
    int maxSize;
    int[] queueArray;
    int front, rear, nItems;
    public Queue(int max){
        maxSize = max;
        queueArray = new int[max];
        front = 0;
        rear = -1;
        nItems = 0;
    }
    public void insert(int j){
        //put an item at the rear of the queue
        if(rear == maxSize - 1){ //deal w/ wraparound
            rear = -1;
        }
        queueArray[++rear] = j; //inc rear and insert
        nItems++; //one more item
    }
    public int remove(){
        //take item from front of the queue
        int temp = queueArray[front++]; //get value and increment front
        if(front==maxSize)
            front = 0;
        nItems--;
        return temp;
    }
    public int peekFront(){
        return queueArray[front];
    }
    public boolean isEmpty(){
        return (nItems == 0);
    }
    public boolean isFull(){
        return nItems == maxSize;
    }
    public int size(){
        return nItems;
    }
}
