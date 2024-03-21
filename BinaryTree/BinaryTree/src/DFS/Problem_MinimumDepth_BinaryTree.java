package DFS;

import Model.BinaryTree_00;

public class Problem_MinimumDepth_BinaryTree {
    private int minSoFar;
    public static void main(String[] args) {
        BinaryTree_00 node_20 = new BinaryTree_00(20, new BinaryTree_00(15), new BinaryTree_00(7));
        BinaryTree_00 tree = new BinaryTree_00(3, new BinaryTree_00(9), node_20);
        BinaryTree_00 tree_01 = new BinaryTree_00(2, null, new BinaryTree_00(3, null, new BinaryTree_00(4, null, new BinaryTree_00(5, null, new BinaryTree_00(6)))));
        Problem_MinimumDepth_BinaryTree test = new Problem_MinimumDepth_BinaryTree();
        test.minSoFar = 0;
        System.out.println(test.minDepth(tree));
        System.out.println("---------------");
        //test.minSoFar = 0;
        //System.out.println(test.minDepth(tree_01));
    }

    public int minDepth(BinaryTree_00 node) {
        return helper(node);
    }

    public int helper(BinaryTree_00 node) {
        if (node == null) {
            return 0;
        }
        // If only one of child is non-null, then go into that recursion.
        if (node.left == null) {
            return 1 + helper(node.right);
        } else if (node.right == null) {
            return 1 + helper(node.left);
        }

        // Both children are non-null, hence call for both children.
        int left = helper(node.left);
        int right = helper(node.right);
        return 1 + Math.min(left, right);
    }
}