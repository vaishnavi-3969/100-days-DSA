import java.util.Scanner;

public class alphabetspam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        char[] array = input.toCharArray();
        int lengthArray = array.length;
        double whitespaces = 0;
        double lowercase = 0;
        double uppercase = 0;
        double symbols = 0;
        
        for (int i = 0; i < array.length; i++) {
            int ch = array[i];
            if (ch == '_') {
                whitespaces++;
            } else if (ch >= 'a' && ch <= 'z') {
                lowercase++;
            } else if (ch >= 'A' && ch <= 'Z') {
                uppercase++;
            } else {
                symbols++;
            }
        }
        
        System.out.println(whitespaces / lengthArray);
        System.out.println(lowercase / lengthArray);
        System.out.println(uppercase / lengthArray);
        System.out.println(symbols / lengthArray);
    }
}
