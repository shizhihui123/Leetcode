package problem226;

/*
*  Created by huangxiaolong on 2016/9/20.
*/

import java.util.*;

public class Solution {
    private TreeNode node;

    public TreeNode invertTree(TreeNode root) {

        Stack<TreeNode> stack = new Stack();
        HashMap<TreeNode, TreeNode> map = new HashMap();

        stack.push(root);

        while (stack.peek() != null) {
            TreeNode node = stack.pop();
            stack.push(node.right);
            stack.push(node.left);
            if (node.left != null && node.right != null) {
                map.put(node.left, node.right);
            }
        }

        Set set = map.entrySet();
        Iterator<Map.Entry> iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry<TreeNode, TreeNode> entry = iterator.next();
            TreeNode key = entry.getKey();
            TreeNode value = entry.getValue();
            int temp = key.val;
            key.val = value.val;
            value.val = temp;
        }
        return root;
    }

    public class TreeNode {
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