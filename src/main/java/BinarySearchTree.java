public class BinarySearchTree {

    private Node root;

    public Node getRoot() {
        return root;
    }



    public void show() {
        showHelper(root);
    }
    private void showHelper(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(" " + node.getValue());
        showHelper(node.getLeftChild());
        showHelper(node.getRightChild());
    }

    public void add(int value) {
        if (root == null) {
            root = new Node(null, value);
            return;
        }

        boolean left = true;
        Node curr = root;
        Node prev = null;
        while (curr != null) {
            prev = curr;
            if (value < curr.getValue()) {
                curr = curr.getLeftChild();
                left = true;
            } else {
                curr = curr.getRightChild();
                left = false;
            }
        }
        if (left) {
            prev.setLeftChild(new Node(prev, value));
        } else {
            prev.setRightChild(new Node(prev, value));
        }
    }

}
