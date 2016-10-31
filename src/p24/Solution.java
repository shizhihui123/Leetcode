package p24;


public class Solution {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
    public void swap(ListNode n1,ListNode n2,ListNode n3){
        n1.next = n3;
        n2.next = n3.next;
        n3.next = n2;
    }

    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        if (head == null){
            return null;
        }
        ListNode temp = dummy;
        ListNode n1 = head;
        ListNode n2 = head.next;
        while (n2 != null){
            swap(temp,n1,n2);
            temp = n1;
            n1 = n1.next;
            if (n1 == null){
                break;
            }
            n2 = n1.next;
        }
        return dummy.next;
    }

}