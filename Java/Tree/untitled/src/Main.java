import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        BinaryTree bt = new BinaryTree();
//        bt.populate(scanner);
//        bt.display();
//        bt.prettyDisplay();
        BST tree = new BST();
        int[] nums = {5,2,7,1,4,9,8,3,10};
        tree.populate(nums);
        tree.display();
    }
}