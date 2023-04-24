import Day.DayWiseIndexing;
import Day.TopicWiseIndexing;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =0;
        do{
            System.out.println("----------------MENU----------------");
            System.out.println("1. Daywise \n2. Topic wise \n0.Exit");
            n = scanner.nextInt();
            switch (n){
                case 0-> System.exit(0);
                case 1-> {
                    DayWiseIndexing.indexing();
                }
                case 2 ->{
                    TopicWiseIndexing.indexing();
                }
                default -> System.out.println("INVALID INPUT!");
            }
        }while(n!=0);
    }
}

