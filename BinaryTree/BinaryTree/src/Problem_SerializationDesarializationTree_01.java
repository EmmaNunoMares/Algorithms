import Model.Tree_00;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Problem_SerializationDesarializationTree_01 {

    //https://leetcode.com/problems/serialize-and-deserialize-n-ary-tree/description/
    public static void main(String[] args) {
        Tree_00 tree = new Tree_00(2);

        Tree_00 node_05 = new Tree_00(5);
        List<Tree_00> children_00 = new ArrayList<>();
        children_00.add(new Tree_00(4));
        children_00.add(new Tree_00(3));
        node_05.children = children_00;

        List<Tree_00> children_01 = new ArrayList<>();
        children_01.add(new Tree_00(3));
        children_01.add(node_05);

        Tree_00 node_03 = new Tree_00(3);
        Tree_00 node_010 = new Tree_00(10);
        List<Tree_00> children_02 = new ArrayList<>();
        children_02.add(node_010);
        node_03.children = children_02;
        children_01.add(node_03);
        children_01.add(new Tree_00(7));

        tree.children = children_01;

        Problem_SerializationDesarializationTree_01 test = new Problem_SerializationDesarializationTree_01();
        String serializationTest = test.serialize(tree);
        System.out.println(serializationTest);
        Tree_00 deserializationTest = test.deserialize(serializationTest);
        System.out.println();
    }


    class WrappableInt {
        private Integer value;

        public WrappableInt(Integer x) {
            this.value = x;
        }

        public Integer getValue() {
            return this.value;
        }

        public void increment() {
            this.value++;
        }
    }

    class NodeInfo {
        Integer parentId;
        Tree_00 node;

        public NodeInfo(Integer parentId, Tree_00 node) {
            this.parentId = parentId;
            this.node = node;
        }
    }

    // Encodes a tree to a single string.
    public String serialize(Tree_00 root) {
        StringBuilder sb = new StringBuilder();
        this.serializeHelper(root, sb, new WrappableInt(1), null);
        return sb.toString();
    }

    private void serializeHelper(Tree_00 root, StringBuilder sb, WrappableInt identity, Integer parentId) {
        if (root == null) {
            return;
        }
        // Identity  - Unique ID for each node
        sb.append((char) (identity.getValue() + '0'));
        // Actual value
        sb.append((char) (root.value + '0'));
        // Parent's identity - Unique ID for each node
        sb.append((char) (parentId == null ? 'N' : parentId + '0'));
        parentId = identity.getValue();
        if (root.children != null) {
            for (Tree_00 child : root.children) {
                identity.increment();
                this.serializeHelper(child, sb, identity, parentId);
            }
        }
    }

    // Decodes the encoded data to tree.
    public Tree_00 deserialize(String data) {
        if (data.isEmpty())
            return null;
        return this.deserializeHelper(data);
    }

    private Tree_00 deserializeHelper(String data) {

        // HashMap
        HashMap<Integer, NodeInfo> nodesAndParents = new HashMap<>();

        // Constructing the hashmap using the input string
        for (int i = 0; i < data.length(); i += 3) {
            int uniqueIdNode = data.charAt(i) - '0';
            int nodeValue = data.charAt(i + 1) - '0';
            int parentId = data.charAt(i + 2) - '0';

            NodeInfo temporal = new NodeInfo(parentId, new Tree_00(nodeValue, new ArrayList<>()));
            nodesAndParents.put(uniqueIdNode, temporal);
        }

        // A second pass for tying up the proper child connections
        for (int i = 3; i < data.length(); i += 3) {
            // Current node
            int id = data.charAt(i) - '0';
            Tree_00 node = nodesAndParents.get(id).node;
            // Parent node
            int parentId = data.charAt(i + 2) - '0';
            Tree_00 parentNode = nodesAndParents.get(parentId).node;
            // Attach!
            parentNode.children.add(node);
        }

        // Return the root node.
        return nodesAndParents.get(data.charAt(0) - '0').node;
    }
}