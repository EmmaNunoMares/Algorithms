import java.util.ArrayList;
import java.util.List;

public class Problem_EasyBranchSum {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree(1);

        BinaryTree node_00 = new BinaryTree(8);
        BinaryTree node_01 = new BinaryTree(9);
        BinaryTree node_02 = new BinaryTree(10);

        BinaryTree node_03 = new BinaryTree(4);
        BinaryTree node_04 = new BinaryTree(5);
        BinaryTree node_05 = new BinaryTree(6);
        BinaryTree node_06 = new BinaryTree(7);

        BinaryTree node_07 = new BinaryTree(2);
        BinaryTree node_08 = new BinaryTree(3);

        node_03.left = node_00;
        node_03.right = node_01;
        node_04.left = node_02;
        node_07.left = node_03;
        node_07.right = node_04;
        tree.left = node_07;

        node_08.left = node_05;
        node_08.right = node_06;
        tree.right = node_08;

        branchSums(tree);
    }

    public static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        BinaryTree(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    public static List<Integer> branchSums(BinaryTree root) {
        List<Integer> sumList = new ArrayList<>();
        calculateBranchSum(root, 0, sumList);
        return sumList;
    }

    public static List<Integer> calculateBranchSum(BinaryTree node, int currentSum, List<Integer> sumList) {
        if (node == null) {
            return sumList;
        }
        if (node.left == null && node.right == null) {
            sumList.add(node.value + currentSum);
            return sumList;
        }
        int helpSum = currentSum + node.value;
        calculateBranchSum(node.left, helpSum, sumList);
        calculateBranchSum(node.right, helpSum, sumList);
        return sumList;
    }
}