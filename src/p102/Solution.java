package p102;

import java.util.*;


public class Solution {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> ret = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        int index = 0;
        int mark = 2;

        queue.add(root);
        if (root == null) {
            return ret;
        }

        list = new ArrayList<>();
        while (queue.size() != 0) {
            TreeNode node = queue.poll();
            index++;
            if (index == mark) {
                if (list.size() != 0) {
                    ret.add(list);
                }
                mark *= 2;
                list = new ArrayList<>();
            }
            if (node == null)
                continue;

            list.add(node.val);
            queue.add(node.left);
            queue.add(node.right);

        }

        return ret;
    }

    public static void main(String args[]){
        TreeNode node1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(9);
        TreeNode node3 = new TreeNode(20);
        TreeNode node4 = new TreeNode(15);
        TreeNode node5 = new TreeNode(7);

        node1.left = node2;
        node1.right = node3;
        node3.left = node4;
        node3.right = node5;



        System.out.println( levelOrder(node1));

    }
}