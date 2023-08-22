import java.util.Arrays;
import java.util.Stack;

public class Main {
    public static String reverse(String string){
        char[] chars = string.toCharArray();
        Stack<Character> st = new Stack<>();
        for(char s: chars){
            st.push(s);
        }
        for(int i =0; i<chars.length; i++){
            chars[i] = st.pop();
        }
        return new String(chars);
    }
    //given an array of integers. FOr each element in the array find it's next greater element in that array
    //the next greater element is the first element towards right, which is greater than current element

    public static int[] nextGreaterElement(int[] arr){
        int[] newArr = new int[arr.length];
        for(int i =0; i<arr.length; i++){
            newArr[i] = -1;
        }
        for(int i =0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] > arr[i]){
                    newArr[i] = arr[j];
                    break;
                }
            }
        }
        return newArr;
    }
    public static int[] nextGreaterElementUsingStack(int[] arr){
        int[] result = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for(int i =arr.length-1; i>=0; i--){
            if(!stack.isEmpty()){
                while(!stack.isEmpty() && stack.peek() <= arr[i]){
                    stack.pop();
                }
            }
            if(stack.isEmpty()){
                result[i] = -1;
            }else {
                result[i] = stack.peek();
            }
            stack.push(arr[i]);
        }
        return result;
    }
    //valid parenthesis
    public static boolean validParenthesis(String parenthesis){
        char[] arr = parenthesis.toCharArray();
        Stack<Character> st = new Stack<>();
        for(char c: arr){
            if(c=='(' || c == '[' || c=='{'){
                st.push(c);
            }else{
                if(st.isEmpty()){
                    return false;
                }
                char temp = st.pop();
                if (!(((temp == '(') && (c == ')')) || ((temp == '[') && (c == ']')) || ((temp == '{') && (c == '}')))){
                    return false;
                }
            }

        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        System.out.println("Reverse of tomato: "+reverse("tomato"));
        System.out.println("Finding next greater element for every element in an array: "+ Arrays.toString(nextGreaterElement(new int[]{4,7,3,4,8,1})));
        System.out.println("Above operation using stack: "+Arrays.toString(nextGreaterElementUsingStack(new int[]{4,7,3,4,8,1})));
        System.out.println("Valid parenthesis: "+validParenthesis("[{()}]"));
        System.out.println("Valid parenthesis: "+validParenthesis("[()"));
        System.out.println("Valid parenthesis: "+validParenthesis("[))))"));
        System.out.println("Valid parenthesis: "+validParenthesis("[({)}]"));
    }
}