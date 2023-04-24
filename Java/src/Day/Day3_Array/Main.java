package Day.Day3_Array;

import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);
    public void day3(){
        System.out.println("~~~---~~~---~~~---~~~---~~~---(START OF DAY-3)---~~~---~~~---~~~---~~~---~~~");
        System.out.println("Enter the max. size of array: ");
        int maxSize = scanner.nextInt(); //array size
        HighArray arr; //reference to array
        arr = new HighArray(maxSize); //creating an array
        //inserting elements in array
        System.out.println("Inserting elements:");
        arr.insert(11);
        arr.insert(22);
        arr.insert(33);
        arr.insert(44);
        arr.insert(55);
        arr.insert(66);
        arr.insert(77);
        arr.insert(88);
        arr.insert(99);
        System.out.println("==============================================");
        System.out.println("Displaying array:");
        arr.display();
        System.out.println("==============================================");
        System.out.println("Searching an elements in an array");
        System.out.println("Enter the element you want to search: ");
        int searchKey = scanner.nextInt();
        if(arr.find(searchKey))
            System.out.println("Found " + searchKey);
        else
            System.out.println(searchKey + "Not found!");
        System.out.println("==============================================");
        System.out.println("Deleting an element");
        System.out.println("Enter the element you want to search");
        int deleteElem = scanner.nextInt();
        arr.delete(deleteElem);
        System.out.println("==============================================");
        System.out.println("Display elements: ");
        arr.display();
        System.out.println("~~~---~~~---~~~---~~~---~~~---(END OF DAY-3)---~~~---~~~---~~~---~~~---~~~");
    }
}
