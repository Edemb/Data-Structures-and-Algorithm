package Blege_BinaryTree;

/*
 * Blege Bright Edem
 * 219CS01000078
 * Binary Tree Assignment
 * */
//Creating the node class
class Node {
    int pointer;
    Node left, right;

    public Node(int unit) {
        pointer = unit;
        left = right = null;
    }
}
//Creating the Binary Tree Class
class BinaryTree {
    Node root;

    BinaryTree(int pointer) {
        root = new Node(pointer);
    }

    BinaryTree() {
        root = null;
    }

    // Code for Traverse In Order
    public void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.pointer);
            traverseInOrder(node.right);
        }
    }

    // Code for Traverse Post Order
    public void traversePostOrder(Node node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.pointer);
        }
    }

    // Code for Traverse Pre-order
    public void traversePreOrder(Node node) {
        if (node != null) {
            System.out.print(" " + node.pointer);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);

        System.out.print("Results for Pre-order Traversal: ");
        tree.traversePreOrder(tree.root);
        System.out.print("\nResults for In-order Traversal: ");
        tree.traverseInOrder(tree.root);
        System.out.print("\nResults for Post-order Traversal: ");
        tree.traversePostOrder(tree.root);
    }
}
