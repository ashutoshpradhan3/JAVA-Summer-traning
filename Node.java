public class Node {
    int data;
    Node left;
    Node right;

    // Constructor to initialize the node with a given key
    public Node(int key) {
        data = key;
        left = null;
        right = null;
    }

    public static void main(String[] args) {
        // Creating the root node and its children
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.left = new Node(4);

        // Example output
        System.out.println("Tree created with root node: " + root.data);
    }
}

