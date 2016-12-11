package p102;

import java.util.*;

<<<<<<< HEAD

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

=======
public class Solution {
    public static List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> warpList = new ArrayList<>();

        if (root == null)
            return warpList;

        queue.offer(root);

        while(queue.size() != 0){
            List<Integer> list = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                TreeNode left = node.left;
                TreeNode right = node.right;

                if (left != null)
                    queue.offer(left);
                if (right != null)
                    queue.offer(right);

                list.add(node.val);
            }
            warpList.add(list);
        }

        return warpList;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static void main(String args[]){
        TreeNode t1 = new TreeNode(3);
        TreeNode t2 = new TreeNode(9);
        TreeNode t3 = new TreeNode(20);
        TreeNode t4 = new TreeNode(15);
        TreeNode t5 = new TreeNode(7);


        t1.left = t2;
        t1.right = t3;
        t3.left = t4;
        t3.right = t5;

        System.out.println(levelOrder(t1));
>>>>>>> c5f879ae5ce802f261f2fc4854f954434ac32ea0
    }
}