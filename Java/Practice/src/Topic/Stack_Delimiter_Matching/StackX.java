package Topic.Stack_Delimiter_Matching;

public class StackX {
    int maxSize;
    char[] stackArray;
    int top;
    public StackX(int max){
        maxSize = max;
        stackArray = new char[max];
        top = -1;
    }
    public void push(char j){
        stackArray[++top] = j;
    }
    public char pop(){
        return stackArray[top--];
    }
    public char peek(){
        return stackArray[top];
    }
    public boolean isEmpty(){
        return top == -1;
    }
}
