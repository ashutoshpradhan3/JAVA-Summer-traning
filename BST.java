//construction of BST and (Insertion, deletion and Inorder traversal in BST) for project week by Ashutosh Pradhan From LPU

/*  creating the following BST

              50
           /     \
          30      70
         /  \    /  \
        20   40  60   80     
 */


class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}


class BST {
    Node root;

    
    BST() {
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

   
    boolean search(int key) {
        return searchRec(root, key);
    }

    
    boolean searchRec(Node root, int key) {
       
        if (root == null || root.key == key) {
            return root != null;
        }

        if (root.key < key) {
            return searchRec(root.right, key);
        }

        return searchRec(root.left, key);
    }

    void deleteKey(int key) {
        root = deleteRec(root, key);
    }


    Node deleteRec(Node root, int key) {
    
        if (root == null) {
            return root;
        }

        
        if (key < root.key) {
            root.left = deleteRec(root.left, key);
        } else if (key > root.key) {
            root.right = deleteRec(root.right, key);
        } else {

            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            
            root.key = minValue(root.right);

            root.right = deleteRec(root.right, root.key);
        }

        return root;
    }

    int minValue(Node root) {
        int minValue = root.key;
        while (root.left != null) {
            minValue = root.left.key;
            root = root.left;
        }
        return minValue;
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

    public static void main(String[] args) {
        BST tree = new BST();


        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        tree.inorder();
        System.out.println();

        System.out.println("Search 40: " + tree.search(40));
        System.out.println("Search 90: " + tree.search(90));

        tree.deleteKey(20);
        System.out.println("Inorder traversal after deleting 20:");
        tree.inorder();
        System.out.println();

        tree.deleteKey(30);
        System.out.println("Inorder traversal after deleting 30:");
        tree.inorder();
        System.out.println();

        tree.deleteKey(50);
        System.out.println("Inorder traversal after deleting 50:");
        tree.inorder();
        System.out.println();
    }
}
