import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day: ");
        int n = 1;
        n = scanner.nextInt();
        do {
            day(n);
        }while(n!=0);
    }
    public static void day(int n){
        switch (n){
            case 1:
                Day1 day1 = new Day1();
                break;
            default:
                System.out.println("Invalid Input! :(");
                break;
        }
    }
}