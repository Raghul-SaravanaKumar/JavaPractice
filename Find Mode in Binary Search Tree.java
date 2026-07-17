import java.util.*;

class Solution {

    HashMap<Integer, Integer> map = new HashMap<>();

    public int[] findMode(TreeNode root) {

        dfs(root);

        int max = 0;

        for(int value : map.values()) {
            max = Math.max(max, value);
        }

        List<Integer> list = new ArrayList<>();

        for(int key : map.keySet()) {
            if(map.get(key) == max) {
                list.add(key);
            }
        }

        int[] result = new int[list.size()];

        for(int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }

    private void dfs(TreeNode node) {

        if(node == null) {
            return;
        }

        map.put(node.val,
                map.getOrDefault(node.val, 0) + 1);

        dfs(node.left);
        dfs(node.right);
    }
}
