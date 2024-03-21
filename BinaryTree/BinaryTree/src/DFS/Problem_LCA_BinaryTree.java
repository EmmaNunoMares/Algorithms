package DFS;

import Model.BinaryTree_00;

public class Problem_LCA_BinaryTree {
    //https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/
    public static void main(String[] args) {

        BinaryTree_00 tree = new BinaryTree_00(3);
        BinaryTree_00 node_04 = new BinaryTree_00(4);
        BinaryTree_00 node_02 = new BinaryTree_00(2, new BinaryTree_00(7), node_04);
        BinaryTree_00 node_05 = new BinaryTree_00(5, new BinaryTree_00(6), node_02);
        BinaryTree_00 node_01 = new BinaryTree_00(1, new BinaryTree_00(0), new BinaryTree_00(8));
        tree.left = node_05;
        tree.right = node_01;

        Problem_LCA_BinaryTree test = new Problem_LCA_BinaryTree();
        BinaryTree_00 out_00 = test.lowestCommonAncestor(tree, node_05, node_01);
        BinaryTree_00 out_01 = test.lowestCommonAncestor(tree, node_05, node_01);
        System.out.println(out_00.value);
        System.out.println(out_01.value);
    }

    public BinaryTree_00 lowestCommonAncestor(BinaryTree_00 node, BinaryTree_00 p, BinaryTree_00 q) {
        if (node == null) {
            return null;
        }

        // first case
        if (node == p || node == q) {
            return node;
        }

        BinaryTree_00 left = lowestCommonAncestor(node.left, p, q);
        BinaryTree_00 right = lowestCommonAncestor(node.right, p, q);

        // second case
        if (left != null && right != null) {
            return node;
        }

        // third case
        if (left != null) {
            return left;
        }

        return right;
    }
}
