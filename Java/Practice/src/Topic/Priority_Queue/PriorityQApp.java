package Topic.Priority_Queue;

public class PriorityQApp {
    public static void main() {
        PriorityQ priorityQ = new PriorityQ(5);
        priorityQ.insert(10);
        priorityQ.insert(20);
        priorityQ.insert(30);
        priorityQ.insert(40);
        priorityQ.insert(50);
        while (!priorityQ.isEmpty()){
            double item = priorityQ.remove();
            System.out.print(item + " ");
        }
        System.out.println("");
    }//end main()
} //end priorityQApp
