package p237;

/**
 * Created by huangxiaolong on 2016/9/29.
 */
public class Solution {
    public static void main(String args[]) {

    }

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
