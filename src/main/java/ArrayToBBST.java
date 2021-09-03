public class ArrayToBBST {

    public static BinarySearchTree arrayToTree(int[] array) {
        BinarySearchTree tree = new BinarySearchTree();
        arrayToTreeHelper(array,0, array.length-1,tree);
        return tree;
    }

    private static void arrayToTreeHelper(int[] array, int min, int max, BinarySearchTree tree) {
        if (min > max) {
            return;
        }

        int middle = (min + max) / 2;
        tree.add(array[middle]);

        arrayToTreeHelper(array, min, middle - 1, tree);
        arrayToTreeHelper(array, middle + 1, max, tree);
    }

    public static void main(String[] args) {
        int array1[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int array2[] = new int[]{5, 23, 73, 83, 84, 90};
        int array3[] = new int[]{-5, -3, 0, 2, 7};
        BinarySearchTree tree1 = arrayToTree(array1);
        tree1.show();
        BinarySearchTree tree2 = arrayToTree(array2);
        tree2.show();
        BinarySearchTree tree3 = arrayToTree(array3);
        tree3.show();

    }
}
