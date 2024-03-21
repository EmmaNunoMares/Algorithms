package DFS;

import Model.BinaryTree_00;

public class Problem_MaximumDifferenceBetweenNodeandAncestor {
    public static void main(String[] args) {
        BinaryTree_00 node_06 = new BinaryTree_00(6, new BinaryTree_00(4), new BinaryTree_00(7));
        BinaryTree_00 node_03 = new BinaryTree_00(3, new BinaryTree_00(1), node_06);

        BinaryTree_00 node_10 = new BinaryTree_00(10, null, new BinaryTree_00(14, new BinaryTree_00(13), null));

        BinaryTree_00 tree = new BinaryTree_00(8, node_03, node_10);
        Problem_MaximumDifferenceBetweenNodeandAncestor test = new Problem_MaximumDifferenceBetweenNodeandAncestor();
        System.out.println(test.maxAncestorDiff(tree));
    }

    public int maxAncestorDiff(BinaryTree_00 node) {
        if (node == null) {
            return 0;
        }
        return helper(node, node.value, node.value);
    }

    public int helper(BinaryTree_00 node, int curMax, int curMin) {
        //If we encounter leaves, return the max-min along the path
        if (node == null) {
            return curMax - curMin;
        }
        // Otherwise, update max and min
        // and return the max of left and right subtrees
        curMax = Math.max(curMax, node.value);
        curMin = Math.min(curMin, node.value);
        int left = helper(node.left, curMax, curMin);
        int right = helper(node.right, curMax, curMin);
        return Math.max(left, right);
    }
}
