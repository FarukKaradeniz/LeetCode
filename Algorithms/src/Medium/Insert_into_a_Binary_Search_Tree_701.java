package Medium;

//https://leetcode.com/problems/insert-into-a-binary-search-tree/description/
public class Insert_into_a_Binary_Search_Tree_701 {
    public static void main(String[] args) {
        TreeNode node = insertIntoBST(null, 9);
    }


    public static TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }

        if (val > root.val) {
            root.right = insertIntoBST(root.right, val);
        } else {
            root.left = insertIntoBST(root.left, val);
        }

        return root;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
