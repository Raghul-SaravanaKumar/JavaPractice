import java.util.*;

class Solution {

    public List<Integer> preorder(Node root) {

        List<Integer> result = new ArrayList<>();

        dfs(root, result);

        return result;
    }

    private void dfs(Node node,
                     List<Integer> result) {

        if(node == null) {
            return;
        }

        result.add(node.val);

        for(Node child : node.children) {
            dfs(child, result);
        }
    }
}
