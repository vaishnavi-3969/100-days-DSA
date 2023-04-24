package Day.Day2_Simple_Array_Operations;

import java.util.Scanner;

public class Day2 {
    public void day2() {
        System.out.println("~~~---~~~---~~~---~~~---~~~---(START OF DAY-2)---~~~---~~~---~~~---~~~---~~~");

        Scanner scanner = new Scanner(System.in);
        //array eg
        System.out.println("Simple array operations");
        System.out.println("Insertion, Deletion, Searching, Display");
        int nElems = 100;
        int[] arr = new int[nElems];
        for (int i = 0; i < 100; i++) {
            arr[i] = i; //inserting elements
        }
//        display items;
        System.out.println("Displaying elements in array");
        for (int j = 0; j < 100; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println("Searching an element in array");
        System.out.println("Enter a no. to be searched in the array: ");
        boolean flag = false;
        int searchkey = scanner.nextInt();
        for (int j : arr) {
            if (searchkey == j) {
                System.out.println("Search Key found");
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("Search Key not found!");
        }
        System.out.println("Delete an item");
        int deleteItem = scanner.nextInt();
        int indexToDelete = 0;
        for (int i = 0; i < arr.length; i++) {
            if (deleteItem == arr[i]) {
                indexToDelete = i;
                break;
            }
        }

        for (int k = indexToDelete; k < arr.length - 1; k++) {
            arr[k] = arr[k + 1];
        }
        nElems--;

        System.out.println("Displaying array");
        for (int j = 0; j < nElems; j++) {
            System.out.print(arr[j] + " ");
        }
        //end
        System.out.println("------------------- Using class -------------------");
        LowArray lowArray = new LowArray(100);
        int noOfElements = 0;
        int j;
        //INSERTING 10 ELEMENTS
        System.out.println("Creating array");
        lowArray.setElem(0, 1);
        lowArray.setElem(1, 2);
        lowArray.setElem(2, 3);
        lowArray.setElem(3, 4);
        lowArray.setElem(4, 5);
        lowArray.setElem(5, 6);
        lowArray.setElem(6, 7);
        lowArray.setElem(7, 8);
        lowArray.setElem(8, 9);
        lowArray.setElem(9, 10);
        noOfElements = 10;
        System.out.println("Displaying arrays: ");
        //an array of 10 elements
        for (j = 0; j < noOfElements; j++) {
            System.out.print(lowArray.getElem(j) + " ");
        }
        System.out.println();
        System.out.println("Enter searchkey: ");
        int searchKey = scanner.nextInt();
        for (j = 0; j < noOfElements; j++) {
            if (lowArray.getElem(j) == searchKey)
                break;
        }
        if (j == noOfElements)
            System.out.println("Can't find " + searchKey);
        else
            System.out.println("Found " + searchKey);

        System.out.println("Deleting value ");
        System.out.println("Enter the no. to be deleted:");
        int n = scanner.nextInt();
        for (j = 0; j < noOfElements; j++) {
            if (lowArray.getElem(j) == n)
                break;
        }
        for (int k = j; k < noOfElements; k++)
            lowArray.setElem(k, lowArray.getElem(k + 1));
        noOfElements--;

        System.out.println("Display: ");
        for (j = 0; j < noOfElements; j++) {
            System.out.print(lowArray.getElem(j) + " ");
        }
        System.out.println();
        System.out.println("~~~---~~~---~~~---~~~---~~~---(END OF DAY-2)---~~~---~~~---~~~---~~~---~~~");
    }

//    public static Pair<Integer,Integer> swap(Pair<Integer,Integer> swapValues){
//        int temp = swapValues.getKey();
//        swapValues = new Pair<>(swapValues.getValue(), temp);
//        return swapValues;
//    }
}
