package Day;

import Day.Day1.Day1;
import Day.Day2_Simple_Array_Operations.Day2;
import Day.Day3_Array.Main;
import Day.Day4_Ordered_Array.OrderedApp;
import Day.Day5_Storing_Objects_Array.ClassDataApp;

import java.util.Scanner;

public class DayWiseIndexing {
    public static void indexing() {
        Scanner scanner = new Scanner(System.in);
        int n = 1;
        do {
            System.out.println("Enter the day: [0.Exit]");
            n = scanner.nextInt();
            switch (n) {
                case 0 -> {
                    System.out.println("<< Going back to Main Menu");
                }
                case 1 -> {
                    Day1 day1 = new Day1();
                    day1.day1();
                }
                case 2 -> {
                    Day2 day2 = new Day2();
                    day2.day2();
                }
                case 3 -> {
                    Main main = new Main();
                    main.day3();
                }
                case 4 -> {
                    OrderedApp orderedApp = new OrderedApp();
                    orderedApp.main();
                }
                case 5 -> {
                    ClassDataApp.main();
                }
                default -> {
                    System.out.println("Invalid Input! :(");
                }
            }
        } while (n != 0);
    }
}
