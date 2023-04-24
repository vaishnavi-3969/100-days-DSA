package Day.Day4_Ordered_Array;

import java.util.Scanner;

public class OrderedApp {
    public void main() {
        System.out.println("~~~---~~~---~~~---~~~---~~~---(START OF DAY-4)---~~~---~~~---~~~---~~~---~~~");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the max. size of array: ");
        int maxSize = scanner.nextInt();
        OrdArray arr;
        arr = new OrdArray(maxSize);
        arr.insert(11);
        arr.insert(22);
        arr.insert(33);
        arr.insert(44);
        arr.insert(55);
        arr.insert(66);
        arr.insert(77);
        arr.insert(88);
        arr.insert(99);
        System.out.println("Enter search key: ");
        int searchKey = scanner.nextInt();
        if (arr.find(searchKey) != arr.size()) {
            System.out.println("Found");
        } else {
            System.out.println("Not found");
        }
        System.out.println("Display: ");
        arr.display();
        System.out.println("Delete an element: ");
        System.out.println("Enter the element to be deleted: ");
        int delete = scanner.nextInt();
        arr.delete(delete);
        System.out.println("Displaying the updated array: ");
        arr.display();
        System.out.println("~~~---~~~---~~~---~~~---~~~---(END OF DAY-4)---~~~---~~~---~~~---~~~---~~~");

    }
}
