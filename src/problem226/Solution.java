package problem226;

/*
*  Created by huangxiaolong on 2016/9/20.
*/

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private TreeNode node;

    public static void main(String args[]) {
        TreeNode root = new TreeNode();
        root.val = 0;
        TreeNode node1 = new TreeNode();
        TreeNode node2 = new TreeNode();
        TreeNode node3 = new TreeNode();
        TreeNode node4 = new TreeNode();
        TreeNode node5 = new TreeNode();
        TreeNode node6 = new TreeNode();

        node1.val = 1;
        node2.val = 2;
        node3.val = 3;
        node4.val = 4;
        node5.val = 5;
        node6.val = 6;

        root.left = node1;
        root.right = node2;

        node1.left = node3;
        node1.right = node4;

        node2.left = node5;
        node2.right = node6;

        invertTree(root);
    }

    public static TreeNode invertTree(TreeNode root) {
        ArrayList<TreeNode> list = new ArrayList();

        int i = 0;
        TreeNode node = null;
        list.add(root);
        while ((node = list.get(i)) != null) {
            list.add(node.left);
            list.add(node.right);
            i++;
        }
        i--;
        int temp = 2;
        while (true) {
            int firstIndex = temp - 1;
            int lastIndex = 2 * (temp - 1);
            swap(firstIndex, lastIndex, list);
            if (i >= firstIndex && i <= lastIndex) {
                break;
            }
            temp = temp * temp;
        }

        return root;
    }

    public static void swap(int start, int end, List<TreeNode> list) {
        TreeNode node1 = list.get(start);
        TreeNode node2 = list.get(end);
        int temp = node1.val;
        node1.val = node2.val;
        node2.val = temp;
        if (start + 1 != end) {
            swap(start + 1, end - 1, list);
        }
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }

        public TreeNode() {
            super();
        }
    }
}