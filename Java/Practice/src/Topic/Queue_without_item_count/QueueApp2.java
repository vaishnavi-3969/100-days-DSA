package Topic.Queue_without_item_count;

public class QueueApp2 {
    public static void main() {
        Queue queue = new Queue(5);
        queue.insert(10);
        queue.insert(20);
        queue.insert(30);
        queue.insert(40);

        queue.remove();
        queue.remove();
        queue.remove();

        queue.insert(50);
        queue.insert(60);
        queue.insert(70);
        queue.insert(80);

        while (!queue.isEmpty()){
            int n = queue.remove();
            System.out.print(n);
            System.out.print(" ");
        }
        System.out.println(" ");
    }
}

/*
* Efficienty of queue:
* inserting and removing: O(1)
* */