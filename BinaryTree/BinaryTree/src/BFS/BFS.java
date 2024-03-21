package BFS;

import Model.BinaryTree_00;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {
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
        BFS test = new BFS();
        test.printAllNodes(tree);
    }

    public void printAllNodes(BinaryTree_00 root) {
        Queue<BinaryTree_00> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int nodesInCurrentLevel = queue.size();
            // do some logic here for the current level
            System.out.println();
            for (int i = 0; i < nodesInCurrentLevel; i++) {
                BinaryTree_00 node = queue.remove();
                // do some logic here on the current node
                System.out.print(node.value + "  ");

                // put the next level onto the queue
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
        }
    }
}