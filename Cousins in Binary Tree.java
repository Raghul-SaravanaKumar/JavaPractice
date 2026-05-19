class Solution {

    public boolean isCousins(TreeNode root, int x, int y) {

        return depth(root, x, 0) == depth(root, y, 0) &&
               parent(root, x) != parent(root, y);
    }

    private int depth(TreeNode node, int value, int level) {

        if(node == null) {
            return -1;
        }

        if(node.val == value) {
            return level;
        }

        int left = depth(node.left, value, level + 1);

        if(left != -1) {
            return left;
        }

        return depth(node.right, value, level + 1);
    }

    private TreeNode parent(TreeNode node, int value) {

        if(node == null) {
            return null;
        }

        if((node.left != null && node.left.val == value) ||
           (node.right != null && node.right.val == value)) {
            return node;
        }

        TreeNode left = parent(node.left, value);

        if(left != null) {
            return left;
        }

        return parent(node.right, value);
    }
}
