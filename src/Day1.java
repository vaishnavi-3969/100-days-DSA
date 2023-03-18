import java.util.Scanner;

public class Day1 {
/*    -----------------------------
    primitive data types:
    1. byte: -128 to 128
    2. short: (2^16/2) to (2^16/2 - 1)
    3. int: 2^32/2 to 2^32/2 - 1
    4. float:
    5. long: 2^64/2 to 2^62/2 -1
    6. double:
    7. char: 0 to 65535(2^16-1)
    8. Boolean: true/false; default: false
    ------------------------------
 */
//    write a java program to add 3 nos.
    public static int add(int a, int b, int c){
        return a + b + c;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first no.: ");
        int a = scanner.nextInt();
        System.out.println("Enter second no.: ");
        int b = scanner.nextInt();
        System.out.println("Enter third no.: ");
        int c = scanner.nextInt();
        System.out.println("The addition of "+ a + ", "+b+" and "+c+" is: ");
        System.out.println(add(a,b,c));
    }
}
