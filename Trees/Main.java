package Trees;

public class Main {

    public static void main(String[] args) {

        // Test 1: Tree with multiple nodes
        Tree tree = new Tree();

        tree.addNode(5);
        tree.addNode(7);
        tree.addNode(3);
        tree.addNode(11);
        tree.addNode(10);

        System.out.println("\nTest 1 - Tree with multiple nodes");

        System.out.print("Pre-order: ");
        tree.preOrder();

        System.out.print("\nIn-order: ");
        tree.inOrder();

        System.out.print("\nPost-order: ");
        tree.postOrder();

        System.out.println("\nNumber of leaves: " + tree.countLeaves());


        // Test 2: Empty tree
        Tree emptyTree = new Tree();

        System.out.println("\nTest 2 - Empty tree");
        System.out.println("Number of leaves: " + emptyTree.countLeaves());


        // Test 3: Tree with one node
        Tree singleNodeTree = new Tree();

        singleNodeTree.addNode(50);

        System.out.println("\nTest 3 - Tree with one node");
        System.out.println("Number of leaves: " + singleNodeTree.countLeaves());

    }
}