// Implementing Inorder , Preorder and Postorder Traversal 

/* creating the following BST
              50
           /     \
          30      70
         /  \    /  \
        20   40  60   80 */

class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}


class Traversal {
    Node root;

    
    Traversal() {
        root = null;
    }

    
    void insert(int key) {
        root = insertRec(root, key);
    }

    
    Node insertRec(Node root, int key) {
        
        if (root == null) {
            root = new Node(key);
            return root;
        }

        
        if (key < root.key) {
            root.left = insertRec(root.left, key);
        } else if (key > root.key) {
            root.right = insertRec(root.right, key);
        }

        
        return root;
    }

    
    void inorder() {
        inorderRec(root);
    }

    
    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.key + " ");
            inorderRec(root.right);
        }
    }

    
    void preorder() {
        preorderRec(root);
    }

    
    void preorderRec(Node root) {
        if (root != null) {
            System.out.print(root.key + " ");
            preorderRec(root.left);
            preorderRec(root.right);
        }
    }

    
    void postorder() {
        postorderRec(root);
    }

    
    void postorderRec(Node root) {
        if (root != null) {
            postorderRec(root.left);
            postorderRec(root.right);
            System.out.print(root.key + " ");
        }
    }

    
    public static void main(String[] args) {
        Traversal tree = new Traversal();

        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        // Inorder 
        System.out.println("Inorder traversal:");
        tree.inorder();
        System.out.println();

        // preorder 
        System.out.println("Preorder traversal:");
        tree.preorder();
        System.out.println();

        // postorder
        System.out.println("Postorder traversal:");
        tree.postorder();
        System.out.println();
    }
}
