package Model;

import java.util.List;

public class Tree_00 {
    public int value;
    public List<Tree_00> children;

    public Tree_00(int value) {
        this.value = value;
    }
    public Tree_00(int value, List<Tree_00> children) {
        this.value = value;
        this.children = children;
    }
}