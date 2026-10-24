# Binary Search Tree (BST) — Java

## Description

This project implements a Binary Search Tree (BST) in Java as part of a Data Structures assignment.

The program allows users to insert nodes, traverse the tree, and count the number of leaf nodes using recursion.

## Student

**Amanda Vitoria de Souza Pedroso**

## Project Structure

The project contains three Java classes:

- **Node.java:** Represents a node with a value, a left child, and a right child.
- **Tree.java:** Contains the methods for inserting nodes, traversing the tree, and counting leaves.
- **Main.java:** Creates trees and tests the methods.

## Implementation

The Binary Search Tree follows these rules:

- Smaller values are inserted on the left.
- Larger values are inserted on the right.
- Duplicate values are not inserted.

The `countLeaves()` method uses recursion to count the leaf nodes.

A leaf is a node that has no left or right child.

The recursive method returns:
- `0` if the node is null.
- `1` if the node is a leaf.
- The sum of the leaves on the left and right sides otherwise.

## Example

```java
Tree tree = new Tree();

tree.addNode(5);
tree.addNode(7);
tree.addNode(3);
tree.addNode(11);
tree.addNode(10);

System.out.println("Number of leaves: " + tree.countLeaves());
```

**Output:**

```text
Number of leaves: 2
```

## Tests

The `Main.java` class includes three tests:

1. Tree with multiple nodes.
2. Empty tree.
3. Tree with only one node.

The project also includes three traversal methods: pre-order, in-order, and post-order.

## Technologies

- Java
- Recursion
- Binary Search Tree
