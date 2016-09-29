package p206;

/**
 * Created by huangxiaolong on 2016/9/29.
 */
public class Solution {

    public static void main(String args[]) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);

        node1.next = node2;
        reverseList(node1);
    }

    public static ListNode reverseList(ListNode head) {
        if (head == null)
            return head;

        ListNode node1 = head;
        ListNode temp = node1.next;
        while (temp != null) {
            temp = node1.next;
            ListNode node2 = temp;
            node2.next = node1;
            head = node1;
        }
        return head;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}