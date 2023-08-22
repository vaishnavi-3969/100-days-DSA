import java.util.List;

public class Queue {
    ListNode rear;
    ListNode front;
    int length;

    Queue(){
        front = null;
        rear = null;
        length = 0;
    }
    public void enqueue(int data){
        ListNode ln = new ListNode(data);
        length++;
        if(front==null){
            front = ln;
            rear = ln;
            return;
        }
        rear.next = ln;
        rear = ln;
    }
    public ListNode dequeue(){
        ListNode top = front;
        if(front==null){
            System.out.println("Queue is empty");
            return null;
        }
        length--;
        front = front.next;
        return top;
    }
    public void display(){
        ListNode temp = front;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    

    private class ListNode{
        int data;
        ListNode next = null;
        ListNode(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.display();
        queue.dequeue();
        queue.display();
        queue.dequeue();
        queue.display();
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(10);
        queue.display();
    }
}