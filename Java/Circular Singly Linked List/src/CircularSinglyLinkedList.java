public class CircularSinglyLinkedList {
    ListNode last;
    int length;
    private class ListNode{
        int data;
        ListNode next=null;

        ListNode(int data){
            this.data = data;
        }
    }
    public CircularSinglyLinkedList(){
        last = null;
        length=0;
    }
    void insertAtEnd(int data){
        ListNode ln = new ListNode(data);
        if(last==null){
            last = ln;
            ln.next = last;
        }else {
            ln.next = last.next;
            last.next = ln;
            last = ln;
        }
        length++;
    }
    void insertAtStart(int data){
        ListNode ln = new ListNode(data);
        if(last==null){
            last = ln;
        }else {
            ln.next = last.next;
        }
        last.next = ln;
        length++;
    }
    public boolean isEmpty(){
        return length == 0;
    }
    ListNode removeAtStart(){
        if(last==null){
            System.out.println("The CSLL is empty");
            return null;
        }
        if(last.next == last){
            last = null;
        }
        ListNode temp = last.next;
        last.next = last.next.next;
        temp.next = null;
        System.out.println("Removing "+temp.data+"...");
        return temp;
    }
     void removeAtEnd(){
        if(isEmpty()){
            System.out.println("CSlL is empty");
            return;
        }
        ListNode temp = last.next;
        while(temp.next!=last){
            temp = temp.next;
        }
         System.out.println("Removing "+last.data+"...");
        temp.next = last.next;
        last.next = null;
        last = temp;
    }
    void display(){
        if(last==null){
            System.out.println("CSLL empty");
            return;
        }
        ListNode first = last.next;
        while(first!=last){
            System.out.print(first.data+"-->");
            first = first.next;
        }
        System.out.println(first.data + " ");
    }
    public static void main(String[] args) {
        CircularSinglyLinkedList csll = new CircularSinglyLinkedList();
        csll.insertAtEnd(10);
        csll.insertAtEnd(20);
        csll.insertAtEnd(30);
        csll.insertAtEnd(40);
        csll.display();
        System.out.println("Length: "+csll.length);
        csll.insertAtStart(0);
        csll.display();
        System.out.println("Length: "+csll.length);
        csll.removeAtStart();
        csll.display();
        csll.removeAtEnd();
        csll.display();
        csll.removeAtEnd();
        csll.display();
        csll.removeAtEnd();
        csll.display();
        csll.removeAtEnd();
    }
}