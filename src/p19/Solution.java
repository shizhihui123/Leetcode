package p19;

import java.util.List;

public class Solution {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head;
        ListNode slow = head;
        ListNode prev = head;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
            if (fast == null)
                break;
        }

        while (fast != null) {
            prev = slow;
            fast = fast.next;
            slow = slow.next;
        }
        if (prev == null) {
            head = null;
            return head;
        }
        if (prev == slow) {
            prev = slow.next;
            return head;
        }
        prev.next = slow.next;

        return head;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static void main(String args[]){
        ListNode n1 = new ListNode(11);
        ListNode n2 = new ListNode(2);
        n1.next = n2;

        removeNthFromEnd(n1,2);
    }
}