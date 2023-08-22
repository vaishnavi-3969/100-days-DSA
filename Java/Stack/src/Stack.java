public class Stack {
    private ListNode top;
    private int length;
    public Stack(){
        top = null;
        length=0;
    }
    private int getLength(){
        return length;
    }
    private class ListNode{
        int data;
        ListNode next = null;
        ListNode(int data){
            this.data = data;
        }
    }
    public void push(int data){
        ListNode temp = new ListNode(data);
        temp.next = top;
        top = temp;
        length++;
    }
    public int peek(){
        return top.data;
    }
    public ListNode pop(){
        ListNode temp = top;
        if(temp == null){
            System.out.println("The stack is empty");
            return null;
        }
        top = top.next;
        length--;
        return temp;
    }
    public void display(){
        ListNode temp = top;
        if(temp==null){
            return;
        }
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(10);
        st.push(20);
        st.push(30);
        System.out.println("Length of stack: "+st.getLength());
        st.display();
        st.pop();
        System.out.println("Element at the top: "+st.peek());
        st.display();
        st.pop();
        st.display();
        st.pop();
        st.display();
        st.pop();
        st.display();
        System.out.println("Length of stack: "+st.getLength());
    }
}