package Topic.Queue_without_item_count;

public class Queue {
    int maxSize, front,rear;
    int[] queueArray;
    public Queue(int max) {
        maxSize = max + 1; //array is 1 cell larger
        queueArray = new int[maxSize];
        front = 0;
        rear = -1;
    }
    public void insert(int j){
        if(rear == maxSize - 1){ //put an item at the rear of the queue
            rear = -1;
            queueArray[++rear] = j;
        }
    }
    public int remove(){
        int temp = queueArray[front++];
        if(front == maxSize)
            front = 0;
        return temp;
    }
    public int peek(){
        return queueArray[front];
    }
    public boolean isEmpty(){
        return ((rear + 1 == front) || (front+maxSize - 1 == rear));
    }
    public boolean isFull(){
        return ((rear + 2 == front) ||(front+maxSize-2 == rear));
    }
    public int size(){ //assumes queue is not empty
        if(rear >= front)
            return rear - front + 1; //contiguous sequence
        else
            return (maxSize-front) + (rear + 1);
    }
}
