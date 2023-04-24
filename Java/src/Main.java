import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 1;
        do {
            System.out.println("Enter the day: ");
            n = scanner.nextInt();
            switch (n) {
                case 1 -> {
                    Day1 day1 = new Day1();
                    day1.day1();
                }
                case 2 -> {
                    Day2 day2 = new Day2();
                    day2.day2();
                }
                default -> {
                    System.out.println("Invalid Input! :(");
                }
            }
        }while(n!=0);
    }
}