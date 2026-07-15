class Solution {

    TreeNode head = new TreeNode(0);
    TreeNode current = head;

    public TreeNode increasingBST(TreeNode root) {

        inorder(root);
        return head.right;
    }

    private void inorder(TreeNode node) {

        if(node == null) {
            return;
        }

        inorder(node.left);

        current.right = new TreeNode(node.val);
        current = current.right;

        inorder(node.right);
    }
}
