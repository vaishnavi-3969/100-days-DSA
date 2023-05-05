package Topic.Sorting;

import java.util.Scanner;

public class Main {
    public static void main(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the max. size of array");
        int maxsize = scanner.nextInt();
        Algorithms arr = new Algorithms(maxsize);
        ArrayInObj aio = new ArrayInObj(maxsize);
        int n =0;
        do{
            System.out.println("""
                    Enter the operations you wish to perform:\s
                    1. Insertion
                    2. Bubble Sort
                    3. Display
                    4. Insertion Sort
                    ==========Objects in array============
                    5. Insertion
                    6. Display
                    7. Insertion Sort(objects)
                    0.Exit""");
            n = scanner.nextInt();
            switch (n){
                case 0:break;
                case 1:
                    System.out.println("Enter the no. you want to insert");
                    double value = scanner.nextInt();
                    arr.insert(value);
                    break;
                case 2:
                    System.out.println("Performing Bubble Sort....");
                    arr.bubbleSort();
                    break;
                case 3:
                    System.out.println("Displaying the array: ");
                    arr.display();
                    break;
                case 4:
                    System.out.println("Performing Insertion Sort...");
                    arr.insertionSort();
                    break;
                case 5:
                    System.out.println("Inserting in Object Array: ");
                    System.out.println("Enter first name: ");
                    String fname = scanner.next();
                    System.out.println("Enter last name: ");
                    String lname = scanner.next();
                    System.out.println("Enter age: ");
                    int age = scanner.nextInt();
                    aio.insert(fname, lname, age);
                    break;
                case 6:
                    System.out.println("Display Array Objects: ");
                    aio.display();
                    break;
                case 7:
                    System.out.println("Performing Insertion Sort for Object Array....");
                    break;
                default:
                    System.out.println("INVALID INPUT!");
                    break;
            }
        }while (n!=0);
        System.out.println("Done!!!!!!!");
    }
}
