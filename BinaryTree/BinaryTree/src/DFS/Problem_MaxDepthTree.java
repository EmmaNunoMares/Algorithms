package DFS;

import Model.BinaryTree_00;

import java.util.Stack;

public class Problem_MaxDepthTree {
    public static void main(String[] args) {
        BinaryTree_00 tree = new BinaryTree_00(0);

        BinaryTree_00 node_01 = new BinaryTree_00(1);
        BinaryTree_00 node_02 = new BinaryTree_00(2);

        BinaryTree_00 node_03 = new BinaryTree_00(3);
        BinaryTree_00 node_04 = new BinaryTree_00(4);
        BinaryTree_00 node_05 = new BinaryTree_00(5);
        BinaryTree_00 node_06 = new BinaryTree_00(6);

        BinaryTree_00 node_07 = new BinaryTree_00(7);
        BinaryTree_00 node_08 = new BinaryTree_00(8);

        node_03.left = node_06;
        node_04.left = node_07;
        node_04.right = node_08;
        node_01.left = node_03;
        node_01.right = node_04;
        tree.left = node_01;

        node_02.right = node_05;
        tree.right = node_02;

        //Recursive
        System.out.println(maxDepthRecursive(tree));
        //Iterative
        Problem_MaxDepthTree test = new Problem_MaxDepthTree();
        System.out.println("---------------------------------");
        System.out.println(test.maxDepthIterative(tree));
    }

    public static int maxDepthRecursive(BinaryTree_00 node) {
        if (node == null) {
            return 0;
        }
        System.out.print(node.value + " ");
        int left = maxDepthRecursive(node.left);
        int right = maxDepthRecursive(node.right);
        System.out.println("   (" + (Math.max(left, right) + 1) +") : ");
        return Math.max(left, right) + 1;
    }

    class Pair {
        BinaryTree_00 node;
        int depth;
        Pair(BinaryTree_00 node, int depth) {
            this.node = node;
            this.depth = depth;
        }
    }
    public int maxDepthIterative(BinaryTree_00 root) {
        if (root == null) {
            return 0;
        }

        Stack<Pair> stack = new Stack<>();
        stack.push(new Pair(root, 1));
        int ans = 0;

        while (!stack.empty()) {
            Pair pair = stack.pop();
            BinaryTree_00 node = pair.node;
            int depth = pair.depth;

            ans = Math.max(ans, depth);
            if (node.left != null) {
                stack.push(new Pair(node.left, depth + 1));
            }
            if (node.right != null) {
                stack.push(new Pair(node.right, depth + 1));
            }
        }
        return ans;
    }
}