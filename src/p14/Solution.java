package p14;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Solution {
    public static boolean hasCycle(ListNode head) {
        ListNode runner = head;
        ListNode walker = head;

        if (runner == null)
            return false;

        while(runner.next != null && runner.next.next != null){
            walker = walker.next;
            runner = runner.next.next;

            if (walker == runner){
                return true;
            }
        }
        return false;

    }

    public static void main(String args[]){
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);

        n1.next = n2;
        n2.next = n1;

        System.out.println(hasCycle(n1));
    }

}