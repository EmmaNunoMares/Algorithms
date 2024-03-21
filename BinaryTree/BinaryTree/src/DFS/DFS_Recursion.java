package DFS;

import Model.BinaryTree_00;

public class DFS_Recursion {

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

        //Pre -> before children
        //In -> in the middle of children
        //Post -> after children

        System.out.print("DFS - PreOrder: ");
        functionRecurtionPreorder(tree);
        System.out.println();
        System.out.print("DFS - InOrder: ");
        functionRecurtionInOrder(tree);
        System.out.println();
        System.out.print("DFS - PosOrder: ");
        functionRecurtionPostOrder(tree);
        System.out.println();
    }

    public static void functionRecurtionPreorder(BinaryTree_00 node) {
        if (node == null) {
            return;
        }
        System.out.print(node.value + " ");
        functionRecurtionPreorder(node.left);
        functionRecurtionPreorder(node.right);
    }

    public static void functionRecurtionInOrder(BinaryTree_00 node) {
        if (node == null) {
            return;
        }
        functionRecurtionInOrder(node.left);
        System.out.print(node.value + " ");
        functionRecurtionInOrder(node.right);
    }

    public static void functionRecurtionPostOrder(BinaryTree_00 node) {
        if (node == null) {
            return;
        }
        functionRecurtionPostOrder(node.left);
        functionRecurtionPostOrder(node.right);
        System.out.print(node.value + " ");
    }
}