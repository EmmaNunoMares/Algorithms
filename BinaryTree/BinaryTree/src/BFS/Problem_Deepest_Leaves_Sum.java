package BFS;

import Model.BinaryTree_00;

import java.util.LinkedList;
import java.util.Queue;

public class Problem_Deepest_Leaves_Sum {
    public static void main(String[] args) {
        BinaryTree_00 node_02 = new BinaryTree_00(2, new BinaryTree_00(4, new BinaryTree_00(7), null), new BinaryTree_00(5));
        BinaryTree_00 node_03 = new BinaryTree_00(3, null, new BinaryTree_00(6, null, new BinaryTree_00(8)));
        BinaryTree_00 tree = new BinaryTree_00(1, node_02, node_03);
        Problem_Deepest_Leaves_Sum test = new Problem_Deepest_Leaves_Sum();
        System.out.println(test.deepestLeavesSum(tree));
    }

    public int deepestLeavesSum(BinaryTree_00 root) {
        if (root == null) {
            return 0;
        }
        Queue<BinaryTree_00> queue = new LinkedList<>();
        queue.add(root);
        int out = 0;
        while (!queue.isEmpty()) {
            int sizeQueue = queue.size();
            out = 0;
            for (int i = 0; i < sizeQueue; i++) {
                BinaryTree_00 node = queue.remove();
                if(node.left== null && node.right== null){
                    out += node.value;
                } else {
                    out = 0;
                }
                if(node.left!=null){
                    queue.add(node.left);
                }
                if(node.right!=null){
                    queue.add(node.right);
                }
            }
        }
        return out;
    }
}