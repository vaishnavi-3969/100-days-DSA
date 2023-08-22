import java.util.NoSuchElementException;

public class DoublyLinkedList {
    private ListNode head;
    private ListNode tail;
    private int length;

    private class ListNode{
        private int data;
        private ListNode previous;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
        }
    }
    public DoublyLinkedList(){
        this.head = null;
        this.tail = null;
        length = 0;
    }
    public boolean isEmpty(){
        return length==0; //or head == null
    }
    public int getLength(){
        return length;
    }
    public void displayForward(){
        ListNode temp = head;
        if(temp==null){
            return;
        }
        while(temp != null){
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void displayBackwards(){
        if(tail==null){
            return;
        }
        while(tail!=null){
            System.out.print(tail.data+"-->");
            tail = tail.previous;
        }
        System.out.println("null");

    }

    public void insertAtBeginning(int data){
        ListNode newNode = new ListNode(data);
        if(isEmpty()){
            tail = newNode;
        }else{
            head.previous = newNode;
        }
        newNode.next = head;
        head = newNode;
        length++;
    }
    public void insertAtEnd(int data){
        ListNode newNode = new ListNode(data);
        if(getLength()==0){
            head = newNode;
        }else{
            tail.next = newNode;
            newNode.previous = tail;
        }
        tail = newNode;
        length++;
    }
    public ListNode deleteBeginning(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        ListNode temp = head;
        if(head==tail){
            tail = null;
        }else{
            head.next.previous = null;
        }
        head = head.next;
        temp.next = null;
        displayForward();
        length--;
        return temp;
    }
    public ListNode deleteLast(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        ListNode temp = tail;
        if(head==tail){
            head = null;
        }else{
            tail.previous.next = null;
        }
        tail = tail.previous;
        temp.previous = null;
        displayForward();
        return temp;
    }
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertAtBeginning(0);
        dll.insertAtBeginning(10);
        dll.insertAtBeginning(30);
        dll.insertAtBeginning(40);
        dll.insertAtEnd(-10);
        dll.insertAtEnd(-20);
        dll.insertAtEnd(-30);
        dll.displayForward();
        dll.displayBackwards();
        dll.deleteBeginning();
//        dll.deleteLast();
        System.out.println("\nLength: "+dll.getLength());
    }
}