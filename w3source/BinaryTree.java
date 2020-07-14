package w3source;

public class BinaryTree {

    static Node root;

    static class Node {
        int data;
        Node left_node;
        Node right_node;

        Node(int d) {
            data = d;
            left_node = null;
            right_node = null;
        }
    }

    /* preorder of binary tree*/
    void preOrder(Node node) {
        if (node == null)
            return;
        System.out.print(node.data + " ");
        preOrder(node.left_node);
        preOrder(node.right_node);
    }

    void preOrder() {
        preOrder(root);
    }

    /* inorder of binary tree*/
    void inOrder(Node node) {
        if (node == null)
            return;
        inOrder(node.left_node);
        System.out.print(node.data + " ");
        inOrder(node.right_node);
    }

    void inOrder() {
        inOrder(root);
    }

    /* postOrder of binary tree*/
    void postOrder(Node node) {
        if (node == null)
            return;
        postOrder(node.left_node);
        postOrder(node.right_node);
        System.out.print(node.data + " ");
    }

    void postOrder() {
        postOrder(root);
    }

    /* depth of tree*/
    public int depth(Node root) {
        if (root == null) {
            return 0;
        }
        int left_depth = depth(root.left_node);
        int right_depth = depth(root.right_node);
        int bigger = Math.max(left_depth, right_depth);
        return bigger + 1;
    }

    //psvm
    public static void main(String[] args) {

 //         BinaryTree.Node obj = new BinaryTree.Node(30);  // : another way to access static inner class
//          binaryTree.preOrder(obj);
//          System.out.println();

        BinaryTree binaryTree = new BinaryTree();
//        binaryTree.root = new Node(30);
//        binaryTree.root.right_node = new Node(20);
//        binaryTree.root.left_node = new Node(10);
//        binaryTree.root.left_node.left_node = new Node(11);
//        binaryTree.root.left_node.right_node = new Node(31);
//        binaryTree.root.right_node.left_node = new Node(21);
//        binaryTree.root.right_node.right_node = new Node(50);

//
//        binaryTree.inOrder();
//        System.out.println();
//
//        binaryTree.postOrder();
//        System.out.println();

//        System.out.println(binaryTree.depth(root));

    }

}

// *** another implementation *** //

//class Node
//{
//    int key;
//    Node left, right;
//
//    public Node(int item)
//    {
//        key = item;
//        left = right = null;
//    }
//}
//
//class BinaryTree
//{
//    // Root of Binary Tree
//    Node root;
//
//    BinaryTree()
//    {
//        root = null;
//    }
//
//    // Print the nodes of binary tree
//
//    void print_Postorder(Node node)
//    {
//        if (node == null)
//            return;
//
//        print_Postorder(node.left);
//
//        print_Postorder(node.right);
//
//        System.out.print(node.key + " ");
//    }
//
//    // Wrappers over above recursive functions
//    void print_Postorder()
//    {
//        print_Postorder(root);
//    }
//    public static void main(String[] args)
//    {
//        BinaryTree tree = new BinaryTree();
//        tree.root = new Node(55);
//        tree.root.left = new Node(21);
//        tree.root.right = new Node(80);
//        tree.root.left.left = new Node(9);
//        tree.root.left.right = new Node(29);
//        tree.root.right.left = new Node(76);
//        tree.root.right.right = new Node(91);
//
//        System.out.println("\nPostorder traversal of binary tree is: ");
//        tree.print_Postorder();
//    }
//}
