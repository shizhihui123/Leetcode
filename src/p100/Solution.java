package p100;

/**
 * Created by huangxiaolong on 2016/9/29.
 */
public class Solution {
    static Boolean isSameTree;

    public static void main(String args[]) {
        TreeNode p = new TreeNode(1);
        TreeNode q = new TreeNode(1);

        q.right = new TreeNode(2);
        p.right = null;
        isSameTree(p, q);
    }


    public static boolean isSameTree(TreeNode p, TreeNode q) {
        isSameTree = true;
        checkTree(p, q);
        return isSameTree;
    }

    public static void checkTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return;
        }
        if (p == null || q == null) {
            isSameTree = false;
            return;
        } else if (p.val != q.val) {
            isSameTree = false;
            return;
        }
        checkTree(p.left, q.left);
        checkTree(p.right, q.right);
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
