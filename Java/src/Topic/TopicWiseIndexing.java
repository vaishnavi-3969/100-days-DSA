package Topic;

import Topic.Sorting.Main;
import Topic.Stack.StackApp;

import java.util.Scanner;

public class TopicWiseIndexing {
    public static void indexing(){
        int n=0;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("""
                    Enter your choice:
                    1. Bubble Sort & Insertion Sort of Object & Integer Array
                    2. Stack""");
            n = scanner.nextInt();
            switch (n){
                case 0:
                    break;
                case 1:
                    Main.main();
                    break;
                case 2:
                    StackApp.main();
                    break;
                default:
                    System.out.println("INVALID INPUT!");
                    break;
            }
    }while (n!=0);
    }
}
