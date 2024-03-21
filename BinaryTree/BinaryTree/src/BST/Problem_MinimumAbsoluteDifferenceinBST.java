package BST;

import Model.BinaryTree_00;

public class Problem_MinimumAbsoluteDifferenceinBST {
    public static void main(String[] args) {
        BinaryTree_00 node_02 = new BinaryTree_00(2, new BinaryTree_00(1), new BinaryTree_00(3));
        BinaryTree_00 tree = new BinaryTree_00(4, node_02, new BinaryTree_00(6));
        Problem_MinimumAbsoluteDifferenceinBST test = new Problem_MinimumAbsoluteDifferenceinBST();
        test.getMinimumDifference(tree);
    }

    public int getMinimumDifference(BinaryTree_00 root) {
        return 0;
    }

    //public int helper(BinaryTree_00 node, int )
}