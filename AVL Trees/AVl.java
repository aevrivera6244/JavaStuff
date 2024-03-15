class AVLTree {
    private Node root;

    private static class Node {
        int key, height;
        Node left, right;

        Node(int d) {
            key = d;
            height = 1;
        }
    }

    // ... other methods

    public void insert(int key) {
        root = insert(root, key);
    }

    private Node insert(Node node, int key) {
        if (node == null) {
            return new Node(key);
        }

        if (key < node.key) {
            node.left = insert(node.left, key);
        } else if (key > node.key) {
            node.right = insert(node.right, key);
        } else {
            return node;
        }

        node.height = 1 + Math.max(height(node.left), height(node.right));

        int balance = height(node.left) - height(node.right);

        if (balance > 1 && key < node.left.key) {
            return rightRotate(node);
        }

        if (balance < -1 && key > node.right.key) {
            return leftRotate(node);
        }

        if (balance > 1 && key > node.left.key) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        if (balance < -1 && key < node.right.key) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    public void delete(int key) {
        root = delete(root, key);
    }

    private Node delete(Node node, int key) {
        if (node == null) {
            return node;
        }

        if (key < node.key) {
            node.left = delete(node.left, key);
        } else if (key > node.key) {
            node.right = delete(node.right, key);
        } else {
            if (node.left == null || node.right == null) {
                Node temp = node.left != null ? node.left : node.right;

                if (temp == null) {
                    temp = node;
                    node = null;
                } else {
                    node.key = temp.key;
                }
            } else {
                Node temp = minValue(node.right);
                node.key = temp.key;
                node.right = delete(node.right, temp.key);
            }
        }

        if (node == null) {
            return node;
        }

        node.height = 1 + Math.max(height(node.left), height(node.right));

        int balance = height(node.left) - height(node.right);

        if (balance > 1 && height(node.left.left) >= height(node.left.right)) {
            return rightRotate(node);
        }

        if (balance > 1 && height(node.left.left) < height(node.left.right)) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

if (balance < -1 && height(node.right.right) >= height(node.right.left)) {
            return leftRotate(node);
        }

        if (balance < -1 && height(node.right.right) < height(node.right.left)) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    // ... other methods
}
