package Medium;

//https://leetcode.com/problems/range-sum-of-bst/description/
public class Range_Sum_Of_BST_938 {
    public static void main(String[] args) {

    }

    public int rangeSumBST(TreeNode root, int L, int R) {
        int count = 0;

        if (root.val <= R && root.val >= L) {
            count = root.val;
        }
        if (root.left != null) {
            count += rangeSumBST(root.left, L, R);
        }
        if (root.right != null) {
            count += rangeSumBST(root.right, L, R);
        }

        return count;

    }

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
