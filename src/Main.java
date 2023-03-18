import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day: ");
        int n = 1;
        n = scanner.nextInt();
        do {
            switch (n){
                case 1:
                    Day1 day1 = new Day1();
                    day1.day1();
                    break;
                default:
                    System.out.println("Invalid Input! :(");
                    break;
            }
        }while(n!=0);
    }
}