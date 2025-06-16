package demo;

public class BinaryTree {
	  static class Node {
	        String name;
	        Node left, right;

	        Node(String name) {
	            this.name = name;
	            left = right = null;
	        }
	    }

	    Node root;

	    // Task 1: Print the root of the tree
	    void printRoot() {
	        if (root != null)
	            System.out.println("Root: " + root.name);
	        else
	            System.out.println("Tree is empty.");
	    }
	    // Task 2: Print left and right child of a node
	    void printChildren(Node node) {
	        if (node != null) {
	            System.out.println("Node: " + node.name);
	            System.out.println("Left Child: " + (node.left != null ? node.left.name : "null"));
	            System.out.println("Right Child: " + (node.right != null ? node.right.name : "null"));
	        }
	    }


    // Task 3: Print top to bottom (pre-order traversal)
    void topToBottom(Node node) {
        if (node == null) return;
        System.out.println(node.name);
        topToBottom(node.left);
        topToBottom(node.right);
    }

    // Task 4: Count nodes
    int countNodes(Node node) {
        if (node == null) return 0;
        return 1 + countNodes(node.left) + countNodes(node.right);
    }

    // Task 5: Count leaf nodes
    int countLeaves(Node node) {
        if (node == null) return 0;
        if (node.left == null && node.right == null) return 1;
        return countLeaves(node.left) + countLeaves(node.right);
    }
    // Task 6: In-order traversal
    void printInOrder(Node node) {
        if (node == null) return;
        printInOrder(node.left);
        System.out.print(node.name + " ");
        printInOrder(node.right);
    }

    // Task 7: Mirror the tree
    Node mirror(Node node) {
        if (node == null) return null;
        Node left = mirror(node.left);
        Node right = mirror(node.right);
        node.left = right;
        node.right = left;
        return node;
    }

    // Task 8: Print all paths from root to leaves
    void printPaths(Node node, String path) {
        if (node == null) return;
        path += node.name + " -> ";
        if (node.left == null && node.right == null) {
            System.out.println(path + "null");
            return;
        }
        printPaths(node.left, path);
        printPaths(node.right, path);
    }

    // Task 9: Check if tree is empty
    boolean isEmpty() {
        return root == null;
    }


	public static void main(String[] args) {
		
		   BinaryTree tree = new BinaryTree();
	        tree.root = new Node("Mom");
	        tree.root.left = new Node("Dad");
	        tree.root.right = new Node("You");

	        System.out.println("1. Print Root:");
	        tree.printRoot();

	        System.out.println("\n2. Print Children of Root:");
	        tree.printChildren(tree.root);

	        System.out.println("\n3. Top to Bottom:");
	        tree.topToBottom(tree.root);

	        System.out.println("\n4. Total Nodes: " + tree.countNodes(tree.root));
	        System.out.println("\n5. Leaf Nodes: " + tree.countLeaves(tree.root));

	        System.out.print("\n6. In-order Traversal: ");
	        tree.printInOrder(tree.root);
	        System.out.println();

	        System.out.println("\n7. Mirror Tree and print In-order:");
	        tree.mirror(tree.root);
	        tree.printInOrder(tree.root);
	        System.out.println();

	        System.out.println("\n8. All Paths from Root to Leaves:");
	        tree.printPaths(tree.root, "");

	        System.out.println("\n9. Is Tree Empty? " + tree.isEmpty());

	}

}
