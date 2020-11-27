package JavaCore10;

public class BinaryTree {

    Node root;

    private Node addNode(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (value < current.value) {
            current.left = addNode(current.left, value);
        } else if (value > current.value) {
            current.right = addNode(current.right, value);
        } else {
            return current;
        }
        return current;
    }

    public void addNodeTree(int value) {
        root = addNode(root, value);
    }

    public static void treeShow(Node node) {
        if (node != null) {
            System.out.print(" " + node.value);
            treeShow(node.left);
            treeShow(node.right);
        }
    }

    private BinaryTree createBinaryTree() {
        BinaryTree bt = new BinaryTree();
        bt.addNodeTree(14);
        bt.addNodeTree(23);
        bt.addNodeTree(11);
        bt.addNodeTree(16);
        bt.addNodeTree(22);
        bt.addNodeTree(27);
        bt.addNodeTree(5);
        bt.addNodeTree(15);
        bt.addNodeTree(18);
        bt.addNodeTree(26);
        bt.addNodeTree(150);
        bt.addNodeTree(8);
        return bt;

    }
}
