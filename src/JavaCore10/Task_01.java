package JavaCore10;

public class Task_01 {
    public static void main(String[] args) {
        Node nd = new Node(20);
        BinaryTree.treeShow(nd);
    }
}

class Node {
    int value;
    Node left;
    Node right;



    Node(int value) {
        this.value = value;
        right = null;
        left = null;
    }


}

