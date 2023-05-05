package Topic.Stack;

public class StackX {
    int maxSize;
    double[] stackArray;
    int top;
//    =====================constructor=====================
    public StackX(int max){
        stackArray = new double[max];
        top = -1;
        maxSize = max;
    }
//    =====================push============================
    public void push(double j){
        stackArray[++top] = j;
    }
//    =====================pop==============================
    public void pop(){
        top--;
    }
//    ====================peek==============================
    public double peek(){
        return stackArray[top];
    }
//    ===================check if list is empty==============
    public boolean isEmpty(){
        return top == -1;
    }
//    ===================check if list is full==============
    public boolean isFull(){
        return top == maxSize-1;
    }
//    ======================display=========================
    public void display(){
        for(int i =0; i<top; i++){
            System.out.print(stackArray[i] + " ");
        }
        System.out.println("");
    }
}
