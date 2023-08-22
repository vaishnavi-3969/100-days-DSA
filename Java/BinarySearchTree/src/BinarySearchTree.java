public class BinarySearchTree {
    private TreeNode root;
    private class TreeNode{
        private int data;
        private TreeNode left;
        private TreeNode right;
        public TreeNode(int data){
            this.data = data;
        }
    }
    public TreeNode insert(TreeNode root, int value){
        if(root==null){
            root = new TreeNode(value);
            return root;
        }
        if(value < root.data){
            root.left = insert(root.left, value);
        } else{
            root.right = insert(root.right, value);
        }
        return root;
    }
    public void display(TreeNode root){
        if(root==null){
            return;
        }
        System.out.print(root.data + " ");
        display(root.left);
        display(root.right);
    }
    public TreeNode search(TreeNode root, int key){
        if(root==null || root.data==key){
            return root;
        }
        if(key < root.data){
            return search(root.left, key);
        } else{
            return search(root.right, key);
        }
    }
    
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.root = bst.insert(bst.root, 1);
        bst.root = bst.insert(bst.root,5);
        bst.root = bst.insert(bst.root,6);
        bst.root = bst.insert(bst.root,2);
        bst.display(bst.root);
//        System.out.println(bst.search(4));
        
    }
}