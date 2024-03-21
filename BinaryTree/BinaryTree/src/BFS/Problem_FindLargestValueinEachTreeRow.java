package BFS;

import Model.BinaryTree_00;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Problem_FindLargestValueinEachTreeRow {
    public static void main(String[] args) {
        BinaryTree_00 tree = new BinaryTree_00(1);
        BinaryTree_00 node_01 = new BinaryTree_00(3, new BinaryTree_00(5), new BinaryTree_00(3));
        BinaryTree_00 node_02 = new BinaryTree_00(2, null, new BinaryTree_00(9));
        tree.left = node_01;
        tree.right = node_02;

        Problem_FindLargestValueinEachTreeRow test = new Problem_FindLargestValueinEachTreeRow();
        System.out.println(test.largestValues(tree));
    }

    public List<Integer> largestValues(BinaryTree_00 root) {
        List<Integer> out = new ArrayList<>();
        Queue<BinaryTree_00> queue = new LinkedList<>();
        queue.add(root);
        if(root == null){
            return out;
        }
        while (!queue.isEmpty()){
            int currentSize = queue.size();
            int maxSoFar = Integer.MIN_VALUE;
            for(int i=0; i<currentSize; i++){
                BinaryTree_00 node = queue.remove();
                if(node.value>maxSoFar){
                    maxSoFar = node.value;
                }
                if(node.left!=null){
                    queue.add(node.left);
                }
                if(node.right!=null){
                    queue.add(node.right);
                }
            }
            out.add(maxSoFar);
        }
        return out;
    }
}
