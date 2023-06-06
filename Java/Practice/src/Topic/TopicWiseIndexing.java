package Topic;

import Topic.Finding_and_deleting_specified_links.LinkList2App;
import Topic.Priority_Queue.PriorityQApp;
import Topic.Queue.QueueApp;
import Topic.Queue_without_item_count.QueueApp2;
import Topic.Simple_Linked_List.LinkListApp;
import Topic.Sorting.Main;
import Topic.Stack.StackApp;
import Topic.Stack_Delimiter_Matching.BracketApp;
import Topic.Stack_Reversing_a_word.ReverseApp;

import java.io.IOException;
import java.util.Scanner;

public class TopicWiseIndexing {
    public static void indexing() throws IOException {
        int n=0;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("""
                    Enter your choice:
                    1. Bubble Sort & Insertion Sort of Object & Integer Array
                    2. Stack
                    3. Stack implementation: Reversing a String
                    4. Stack implementation: Bracket Delimiter
                    5. Queue
                    6. Queue without an item count
                    7. Priority Queue
                    8. Simple Linked List
                    9. Finding and deleting specified Links from Linked List
                    """);
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
                case 3:
                    ReverseApp.main();
                    break;
                case 4:
                    BracketApp.main();
                    break;
                case 5:
                    QueueApp.main();
                    break;
                case 6:
                    QueueApp2.main();
                    break;
                case 7:
                    PriorityQApp.main();
                    break;
                case 8:
                    LinkListApp.main();
                    break;
                case 9:
                    LinkList2App.main();
                    break;
                default:
                    System.out.println("INVALID INPUT!");
                    break;
            }
    }while (n!=0);
    }
}
