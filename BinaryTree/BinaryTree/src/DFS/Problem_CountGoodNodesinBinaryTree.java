package DFS;

import Model.BinaryTree_00;

public class Problem_CountGoodNodesinBinaryTree {
    private static int goodNodes = 0;
    //https://leetcode.com/problems/count-good-nodes-in-binary-tree/description/
    public static void main(String[] args) {
        BinaryTree_00 tree = new BinaryTree_00(3);
        BinaryTree_00 node_01 = new BinaryTree_00(1, new BinaryTree_00(3), null);
        BinaryTree_00 node_04 = new BinaryTree_00(4, new BinaryTree_00(1), new BinaryTree_00(5));
        tree.left = node_01;
        tree.right = node_04;
        int test = goodNodes(tree);
        System.out.println(test);
    }

    public static int goodNodes(BinaryTree_00 tree) {
        helper(tree, Integer.MIN_VALUE);
        return goodNodes;
    }

    public static void helper(BinaryTree_00 node, int maxSoFar) {
        if (maxSoFar <= node.value) {
            goodNodes++;
        }
        if (node.left != null) {
            helper(node.left, Math.max(node.value, maxSoFar));
        }
        if (node.right != null) {
            helper(node.right, Math.max(node.value, maxSoFar));
        }
    }
}