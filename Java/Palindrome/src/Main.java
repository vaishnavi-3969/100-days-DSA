import java.util.Scanner;

//given a string check if it is palindrome
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

        int low = 0, high = s.length() - 1, flag = 0;

        while (low < high) {
            if (s.charAt(low) != s.charAt(high)) {
                flag = 1;
                break;
            }
            low++;
            high--;
        }
        if (flag == 1) {
            System.out.println("Not a palindrome");
        } else {
            System.out.println("Palindrome");
        }
    }
}