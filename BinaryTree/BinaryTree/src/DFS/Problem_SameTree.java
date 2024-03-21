package DFS;

import Model.BinaryTree_00;

public class Problem_SameTree {

    //https://leetcode.com/problems/same-tree/description/

    public static void main(String[] args) {
        BinaryTree_00 tree_00 = new BinaryTree_00(1, new BinaryTree_00(2), new BinaryTree_00(3));
        BinaryTree_00 tree_01 = new BinaryTree_00(1, new BinaryTree_00(2), new BinaryTree_00(3));
        BinaryTree_00 tree_02 = new BinaryTree_00(1, new BinaryTree_00(3), new BinaryTree_00(2));

        Problem_SameTree sameTree = new Problem_SameTree();
        System.out.println(sameTree.isSameTree(tree_00, tree_01));
        System.out.println(sameTree.isSameTree(tree_01, tree_02));
    }

    public boolean isSameTree(BinaryTree_00 p, BinaryTree_00 q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        if (p.value != q.value) {
            return false;
        }
        boolean isLeftSame = isSameTree(p.left, q.left);
        boolean isrightSame = isSameTree(p.right, q.right);
        return isLeftSame && isrightSame;
    }
}
