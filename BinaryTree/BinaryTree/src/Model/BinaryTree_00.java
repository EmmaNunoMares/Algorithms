package Model;

import java.util.List;

public class BinaryTree_00 {

    public int value;
    public BinaryTree_00 left;
    public BinaryTree_00 right;
    public BinaryTree_00(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
    public BinaryTree_00(int value, BinaryTree_00 left, BinaryTree_00 right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
}