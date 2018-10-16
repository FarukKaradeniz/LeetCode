package Easy;

//https://leetcode.com/problems/merge-two-binary-trees/description/
public class Merge_Two_Binary_Trees_617 {
    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        t1.left = new TreeNode(3);
        t1.left.left = new TreeNode(5);
        t1.right = new TreeNode(2);

        TreeNode t2 = new TreeNode(2);
        t2.left = new TreeNode(1);
        t2.left.right = new TreeNode(4);
        t2.right = new TreeNode(3);
        t2.right.right = new TreeNode(7);

        TreeNode t3 = mergeTrees(t1, t2);
        System.out.println(t3.val);
    }

    public static TreeNode mergeTrees(TreeNode t1, TreeNode t2) {

        TreeNode treeNode;
        if (t1 != null && t2 != null) { //if both nodes exists create a new node with adding up both values
            treeNode = new TreeNode(t1.val + t2.val);
        } else if (t1 == null && t2 == null) { //if both nodes doesnt exist return null
            return null;
        } else { //if one of the nodes exists create a new node with its value
            treeNode = new TreeNode(t1 == null ? t2.val : t1.val);
        }
        treeNode.left = mergeTrees(t1 != null ? t1.left : null, t2 != null ? t2.left : null); //do the same operations for the left part of the tree
        treeNode.right = mergeTrees(t1 != null ? t1.right : null, t2 != null ? t2.right : null); //do the same operations for the right part of the tree

        return treeNode;
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
