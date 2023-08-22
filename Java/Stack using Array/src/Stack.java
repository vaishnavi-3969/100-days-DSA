public class Stack {
    private int length;
    private int[] stack;
    private int top;
    public Stack(int length){
        this.length = length;
        stack = new int[length];
        top = -1;
    }
    public void push(int data){
        if(isFull()){
            throw new RuntimeException("Stack is Full!");
        }
        top++;
       stack[top] = data;
    }
    public int pop(){
        int temp = stack[top];
        stack[top] = 0;
        top--;
        return temp;
    }
    public void display(){
        for(int i =0; i<=top; i++){
            System.out.print(stack[i] + "-->");
        }
        System.out.println("null");
    }
    public boolean isFull(){
        return length == size();
    }
    public int size(){
        return length+1;
    }
    public int peek(){
        return stack[top];
    }

    public static void main(String[] args) {
        Stack st = new Stack(5);
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.display();
        st.pop();
        st.pop();
        st.display();
    }
}