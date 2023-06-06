package Topic.Stack;

import java.util.Scanner;

public class StackApp {
    public static void main(){
        Scanner scanner = new Scanner(System.in);
        int n =0;
        int maxSize;
        System.out.println("Enter max. size of array: ");
        maxSize = scanner.nextInt();
        StackX stackX = new StackX(maxSize);
        do{
            System.out.println("""
                Choose out of the following
                1. Push to stack
                2. Pop
                3. Peek
                4. Display""");
            n = scanner.nextInt();
            switch (n){
                case 0:break;
                case 1:
                    System.out.println("Enter no. to be pushed: ");
                    double j = scanner.nextInt();
                    stackX.push(j);
                    System.out.println("Item pushed!");
                    break;
                case 2:
                    stackX.pop();
                    System.out.println("Item popped!");
                    break;
                case 3:
                    System.out.println("Item at the top: " + stackX.peek());
                    break;
                case 4:
                    stackX.display();
                    break;
                default:
                    System.out.println("INVALID INPUT!");
                    break;
            }
        }while (n!=0);
    }
}
