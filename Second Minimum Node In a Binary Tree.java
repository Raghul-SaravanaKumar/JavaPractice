class Solution {

    long second = Long.MAX_VALUE;
    int min;

    public int findSecondMinimumValue(TreeNode root) {

        min = root.val;
        dfs(root);

        return second == Long.MAX_VALUE ? -1 : (int) second;
    }

    private void dfs(TreeNode node) {

        if(node == null) {
            return;
        }

        if(node.val > min && node.val < second) {
            second = node.val;
        }

        dfs(node.left);
        dfs(node.right);
    }
}
