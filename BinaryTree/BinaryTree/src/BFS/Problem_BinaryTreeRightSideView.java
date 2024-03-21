package BFS;

import Model.BinaryTree_00;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Problem_BinaryTreeRightSideView {

    //https://leetcode.com/problems/binary-tree-right-side-view/description/
    public static void main(String[] args) {
        Problem_BinaryTreeRightSideView test = new Problem_BinaryTreeRightSideView();
        BinaryTree_00 tree = new BinaryTree_00(0);

        BinaryTree_00 node_01 = new BinaryTree_00(1);
        BinaryTree_00 node_02 = new BinaryTree_00(2);

        BinaryTree_00 node_03 = new BinaryTree_00(3);
        BinaryTree_00 node_04 = new BinaryTree_00(4);
        BinaryTree_00 node_05 = new BinaryTree_00(5);
        BinaryTree_00 node_06 = new BinaryTree_00(6);

        BinaryTree_00 node_07 = new BinaryTree_00(7);
        BinaryTree_00 node_08 = new BinaryTree_00(8);
        BinaryTree_00 node_09 = new BinaryTree_00(9);
        BinaryTree_00 node_10 = new BinaryTree_00(10);

        node_03.left = node_07;
        node_03.right = node_08;
        node_04.left = node_09;
        node_04.right = node_10;
        node_01.left = node_03;
        node_01.right = node_04;
        tree.left = node_01;

        node_02.left = node_05;
        node_02.right = node_06;
        tree.right = node_02;
        List<Integer> out = test.rightSideView(tree);
        System.out.println(out);
    }

    public List<Integer> rightSideView(BinaryTree_00 root) {
        if (root == null) {
            return new ArrayList<>();
        }

        List<Integer> ans = new ArrayList<>();
        Queue<BinaryTree_00> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int currentLength = queue.size();
            int prev = 0;

            for (int i = 0; i < currentLength; i++) {
                BinaryTree_00 node = queue.remove();
                prev = node.value;
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }

            ans.add(prev);
        }

        return ans;
    }
}