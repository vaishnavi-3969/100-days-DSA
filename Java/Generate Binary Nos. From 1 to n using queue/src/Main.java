import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static String convertToBinary(int n){
        Stack<Integer> st = new Stack<>();
        do{
            int temp = n%2;
            st.push(temp);
            n = n/2;
        }while(n>0);
        String temp = "";
        while (!st.isEmpty()){
            temp = temp+st.pop();
        }
        return temp;
    }
    public static void binaryNosFrom1Ton(int n){
        Queue queue = new LinkedList();
        for(int i =0; i<=n; i++){
            queue.offer(convertToBinary(i));
        }
        while (!queue.isEmpty()){
            System.out.print(queue.poll()+",");
        }
    }
    public static void main(String[] args) {
        System.out.println(convertToBinary(5));
        binaryNosFrom1Ton(5);
    }
}