public class Day2 {
    public void day2() {
        //array eg
        System.out.println("Simple array operations");
        System.out.println("Insertion, Deletion, Searching, Display");
        int noOfElements = 100;
        int[] arr = new int[noOfElements];
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
        int searchkey = Day1.scanner.nextInt();
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
        int deleteItem = Day1.scanner.nextInt();
        int indexToDelete = 0;
        for (int i = 0; i < arr.length; i++) {
            if (deleteItem == arr[i]) {
                indexToDelete = i;
                break;
            }
        }

        for (int k = indexToDelete; k < arr.length-1; k++) {
            arr[k] = arr[k + 1];
        }
        noOfElements--;

        System.out.println("Displaying array");
        for (int j = 0; j < noOfElements; j++) {
            System.out.print(arr[j] + " ");
        }
        //end
    }

//    public static Pair<Integer,Integer> swap(Pair<Integer,Integer> swapValues){
//        int temp = swapValues.getKey();
//        swapValues = new Pair<>(swapValues.getValue(), temp);
//        return swapValues;
//    }
}
