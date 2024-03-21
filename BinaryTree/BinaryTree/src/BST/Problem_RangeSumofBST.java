package BST;

import Model.BinaryTree_00;

public class Problem_RangeSumofBST {
        int out =0;
    public static void main(String[] args) {
        BinaryTree_00 node_05 = new BinaryTree_00(5, new BinaryTree_00(3), new BinaryTree_00(7));
        BinaryTree_00 node_15 = new BinaryTree_00(15, null, new BinaryTree_00(18));
        BinaryTree_00 tree = new BinaryTree_00(10, node_05, node_15);
        Problem_RangeSumofBST test = new Problem_RangeSumofBST();
        System.out.println(test.rangeSumBST(tree, 7, 15));



    }

    public int rangeSumBST(BinaryTree_00 root, int low, int high) {
        this.helper(root, low, high);
        return out;
    }

    public void helper(BinaryTree_00 root, int low, int high){
        if(root==null){
            return;
        }
        if(root.value<=high && root.value>=low){
            out += root.value;
        }
        helper(root.left, low, high);
        helper(root.right, low, high);
    }
}