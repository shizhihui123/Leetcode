package problem104;


/**
 * Created by huangxiaolong on 2016/9/20.
 */


public class Solution {

    public int maxDepth(TreeNode root) {
        if (root == null && root == null) {
            return 0;
        }
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
