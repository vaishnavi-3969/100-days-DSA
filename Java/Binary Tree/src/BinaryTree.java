import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {
    private TreeNode root;

    private class TreeNode{
        private int data;
        private TreeNode right=null,left=null;
        TreeNode(int data){
            this.data = data;
        }
    }
    //iterative
    public void iterativePreOrder(TreeNode root){
        if(root==null){
            return;
        }
        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        while(!st.isEmpty()){
            TreeNode temp = st.pop();
            System.out.print(temp.data+" ");
            if(temp.right!=null){
                st.push(temp.right);
            }
            if(temp.left!=null){
                st.push(temp.left);
            }
        }
    }
    public void iterativeInorderTraversal(TreeNode root){
        if(root==null){
            return;
        }
        Stack<TreeNode> st = new Stack<>();
        TreeNode current = root;
        while(current!=null || !st.isEmpty()){
            ///reach the leftmost node of the current subtree
            while(current!=null){
                st.push(current);
                current = current.left;
            }
            //node at the top is the next node to process
            current = st.pop();
            System.out.print(current.data + " ");
            //move to right subtree
            current = current.right;
        }
    }
    public void iterativePostOrder(TreeNode root){
       if(root==null){
           return;
       }
       Stack<TreeNode> st = new Stack<>();
       st.push(root);
       Stack<TreeNode> output = new Stack<>();
       while(!st.isEmpty()){
           TreeNode current = st.pop();
           output.push(current);
           if(current.left!=null){
               st.push(current.left);
           }
           if(current.right!=null){
               st.push(current.right);
           }
       }
       while(!output.isEmpty()){
           TreeNode node = output.pop();
           System.out.print(node.data + " ");
       }
    }
    //recursive
    public void preOrderTraversal(TreeNode root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }
    public void inOrderTraversal(TreeNode root){
        if(root==null){
            return;
        }
        inOrderTraversal(root.left);
        System.out.print(root.data + " ");
       inOrderTraversal(root.right);
    }
    public void postOrderTraversal(TreeNode root){
        if(root == null){
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.data + " ");
    }
    public void createBinaryTree(){
//        TreeNode first = new TreeNode(1);
//        TreeNode second = new TreeNode(2);
//        TreeNode third = new TreeNode(3);
//        TreeNode fourth = new TreeNode(4);
//        TreeNode fifth = new TreeNode(5);
//        root = first;
//        root.right = third;
//        root.left = second;
//        third.left = fourth;
//        third.right = fifth;
        TreeNode first = new TreeNode(1);
        TreeNode secondLeft = new TreeNode(2);
        TreeNode secondRight = new TreeNode(2);
        TreeNode thirdLeft = new TreeNode(3);
        TreeNode thirdRight = new TreeNode(3);
        root =first;
        first.left = secondLeft;
        first.right = secondRight;
        secondLeft.left = thirdLeft;
        secondRight.right = thirdRight;
//        thirdRight.right=new TreeNode(4);
    }
    //leetcode 101:
    public boolean isSymmetrical(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        if (root == null) return true;
        stack.push(root.left);
        stack.push(root.right);
        while (!stack.isEmpty()) {
            TreeNode n1 = stack.pop();
            TreeNode n2 = stack.pop();
            if (n1 == null && n2 == null) continue;
            if (n1 == null || n2 == null || n1.data != n2.data) return false;
            stack.push(n1.left);
            stack.push(n2.right);
            stack.push(n1.right);
            stack.push(n2.left);
        }
        return true;
    }

    public void levelOrderTraversal(TreeNode root){
        if(root == null){
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
    while(!queue.isEmpty()){
        TreeNode temp = queue.poll();
        System.out.print(temp.data + " ");
        if(temp.left!=null){
            queue.offer(temp.left);
        }
        if(temp.right!=null){
            queue.offer(temp.right);
        }
    }
    }
    public int findMaxRec(TreeNode root){
        if(root==null){
            return Integer.MIN_VALUE;
        }
        int result = root.data;
        int left = findMaxRec(root.left);
        int right = findMaxRec(root.right);
        if(left > result){
            result = left;
        }
        if(right > result){
            result = right;
        }
        return result;
    }
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.createBinaryTree();
        System.out.println("Preorder Traversal: ");
        binaryTree.preOrderTraversal(binaryTree.root);
        System.out.println("\nInorder traversal:");
        binaryTree.inOrderTraversal(binaryTree.root);
        System.out.println("\nPostorder traversal: ");
        binaryTree.postOrderTraversal(binaryTree.root);
        System.out.println("\nIterative Preorder traversal");
        binaryTree.iterativePreOrder(binaryTree.root);
        System.out.println("\nIterative Inorder traversal: ");
        binaryTree.iterativeInorderTraversal(binaryTree.root);
        System.out.println("\nIterative Postorder traversal: ");
        binaryTree.iterativePostOrder(binaryTree.root);
        System.out.println("\nFind max. value in a binary tree(recursive): " + binaryTree.findMaxRec(binaryTree.root));
        System.out.println("Level order traversal: ");
        binaryTree.levelOrderTraversal(binaryTree.root);
        //check if the binary tree is symmetrical
        System.out.println(binaryTree.isSymmetrical(binaryTree.root));
    }
}