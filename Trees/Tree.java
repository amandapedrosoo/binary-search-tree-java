package Trees;

public class Tree {

    public Node root;

    // Insert a new node into the tree
    public void addNode(int value) {
        root = addNodeIn(value, root);
    }

    // Find the correct position for the new node
    private Node addNodeIn(int value, Node currentNode) {

        if (currentNode == null) {
            return new Node(value);
        }

        if (value < currentNode.value) {
            currentNode.left = addNodeIn(value, currentNode.left);

        } else if (value > currentNode.value) {
            currentNode.right = addNodeIn(value, currentNode.right);
        }

        return currentNode;
    }

    // Print nodes in pre-order
    public void preOrder() {
        preOrderTraversal(root);
    }

    private void preOrderTraversal(Node currentNode) {

        if (currentNode != null) {
            System.out.print(currentNode.value + " ");
            preOrderTraversal(currentNode.left);
            preOrderTraversal(currentNode.right);
        }
    }

    // Print nodes in order
    public void inOrder() {
        inOrderTraversal(root);
    }

    private void inOrderTraversal(Node currentNode) {

        if (currentNode != null) {
            inOrderTraversal(currentNode.left);
            System.out.print(currentNode.value + " ");
            inOrderTraversal(currentNode.right);
        }
    }

    // Print nodes in post-order
    public void postOrder() {
        postOrderTraversal(root);
    }

    private void postOrderTraversal(Node currentNode) {

        if (currentNode != null) {
            postOrderTraversal(currentNode.left);
            postOrderTraversal(currentNode.right);
            System.out.print(currentNode.value + " ");
        }
    }

    // Count the leaves in the tree
    public int countLeaves() {
        return countLeavesIn(root);
    }

    // Check each node and count the leaves
    private int countLeavesIn(Node currentNode) {

        // If the node is null, return 0
        if (currentNode == null) {
            return 0;
        }

        // If the node has no children, it is a leaf
        if (currentNode.left == null && currentNode.right == null) {
            return 1;
        }

        int count = 0;

        // Count leaves on the left side
        count += countLeavesIn(currentNode.left);

        // Count leaves on the right side
        count += countLeavesIn(currentNode.right);

        // Return the total number of leaves
        return count;
    }
}