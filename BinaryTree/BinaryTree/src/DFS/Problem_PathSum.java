package DFS;

import Model.BinaryTree_00;

import java.util.ArrayList;
import java.util.List;

public class Problem_PathSum {
    //https://leetcode.com/problems/path-sum/description/
    public static void main(String[] args) {
        BinaryTree_00 tree = new BinaryTree_00(5);

        BinaryTree_00 node_11 = new BinaryTree_00(11, new BinaryTree_00(7), new BinaryTree_00(2));
        BinaryTree_00 node_13 = new BinaryTree_00(13);
        BinaryTree_00 node_04 = new BinaryTree_00(4, null, new BinaryTree_00(1));

        BinaryTree_00 node_00 = new BinaryTree_00(4, node_11, null);
        BinaryTree_00 node_08 = new BinaryTree_00(8, node_13, node_04);

        tree.left = node_00;
        tree.right = node_08;
        boolean test_00 = hasPathSum(tree, 22);
        boolean test_01 =dfs(tree, 0, 22);
        System.out.println(test_00);
        System.out.println(test_01);
    }

    public static boolean hasPathSum(BinaryTree_00 root, int targetSum) {
        List<Integer> listHelper = new ArrayList<>();
        helper(root, listHelper, 0);
        return listHelper.contains(targetSum);
    }

    public static void helper(BinaryTree_00 node, List<Integer> out, int currentValue) {
        if (node == null)
            return;

        if(node.left == null && node.right ==null){
            out.add(node.value + currentValue);
        }

        int sum = node.value + currentValue;
        helper(node.left, out, sum);
        helper(node.right, out, sum);
    }

    public static boolean dfs(BinaryTree_00 node, int curr, int target) {
        if (node == null) {
            return false;
        }

        if (node.left == null && node.right == null) {
            return (curr + node.value) == target;
        }

        curr += node.value;
        boolean left = dfs(node.left, curr, target);
        boolean right = dfs(node.right, curr, target);
        return left || right;
    }
}
