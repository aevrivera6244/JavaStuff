import java.util.Scanner;

class AVLNode {
    int data;
    AVLNode left;
    AVLNode right;
    int height;

    AVLNode(int data) {
        this.data = data;
        this.height = 1;
    }
}

class AVLTree {
    AVLNode root;

    // Function to get the height of a node
    int height(AVLNode node) {
        if (node == null)
            return 0;
        return node.height;
    }

    // Function to update the height of a node
    void updateHeight(AVLNode node) {
        if (node != null)
            node.height = Math.max(height(node.left), height(node.right)) + 1;
    }

    // Function to right rotate subtree rooted with y
    AVLNode rightRotate(AVLNode y) {
        AVLNode x = y.left;
        AVLNode T2 = x.right;

        // Perform rotation
        x.right = y;
        y.left = T2;

        // Update heights
        updateHeight(y);
        updateHeight(x);

        // Return new root
        return x;
    }

    // Function to left rotate subtree rooted with x
    AVLNode leftRotate(AVLNode x) {
        AVLNode y = x.right;
        AVLNode T2 = y.left;

        // Perform rotation
        y.left = x;
        x.right = T2;

        // Update heights
        updateHeight(x);
        updateHeight(y);

        // Return new root
        return y;
    }

    // Function to insert a node in AVL Tree
    AVLNode insertNode(AVLNode node, int data, StringBuilder log) {
        // Perform normal BST insertion
        if (node == null) {
            if (root == null) {
                log.append(String.format("Insert %d:\n- AVL Tree is empty, %d becomes the root node\n", data, data));
            }
            return new AVLNode(data);
        }

        if (data < node.data) {
            if (node.left == null) {
                node.left = new AVLNode(data);
                log.append("");
            } else {
                node.left = insertNode(node.left, data, log);
                log.append("");
            }
        } else if (data > node.data) {
            if (node.right == null) {
                node.right = new AVLNode(data);
                log.append("");
            } else {
                node.right = insertNode(node.right, data, log);
                log.append("");
            }
        } else // Duplicate keys not allowed
            return node;

        // Update height of this ancestor node
        updateHeight(node);

        // Rebalance the tree if necessary
        return rebalance(node);
    }

    // Function to delete a node in AVL Tree using AVL Delete Algorithm
    AVLNode deleteNode(AVLNode root, int data, StringBuilder log) {
        // Perform standard BST delete
        if (root == null)
            return root;

        if (data < root.data) {
            root.left = deleteNode(root.left, data, log);
        } else if (data > root.data) {
            root.right = deleteNode(root.right, data, log);
        } else {
            // Node with only one child or no child
            if ((root.left == null) || (root.right == null)) {
                AVLNode temp = null;
                if (temp == root.left)
                    temp = root.right;
                else
                    temp = root.left;

                // No child case
                if (temp == null) {
                    temp = root;
                    root = null;
                } else // One child case
                    root = temp; // Copy the contents of the non-empty child

                temp = null;
            } else {
                // Node with two children: Get the inorder predecessor (greatest in the left subtree)
                AVLNode temp = maxValueNode(root.left);

                // Copy the inorder predecessor's data to this node
                root.data = temp.data;

                // Delete the inorder predecessor
                root.left = deleteNode(root.left, temp.data, log);
            }
        }

        // If the tree had only one node then return
        if (root == null)
            return root;

        // Update the height of the current node
        updateHeight(root);

        // Rebalance the tree if necessary
        return rebalance(root);
    }

    // Function to find the inorder predecessor
    AVLNode maxValueNode(AVLNode node) {
        AVLNode current = node;
        while (current.right != null)
            current = current.right;
        return current;
    }
// Function to rebalance the tree to ensure the root is a specific value
AVLNode rebalanceRoot(AVLNode node, int rootValue) {
    if (node == null)
        return null;

    if (node.data == rootValue)
        return node;

    if (rootValue < node.data) {
        node.left = rebalanceRoot(node.left, rootValue);
        return rightRotate(node);
    } else {
        node.right = rebalanceRoot(node.right, rootValue);
        return leftRotate(node);
    }
}

    // Function to rebalance the AVL Tree if necessary
    AVLNode rebalance(AVLNode node) {
        int balance = balanceFactor(node);
