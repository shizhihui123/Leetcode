package p83;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        HashMap map = new HashMap();
        if (head == null){
            return head;
        }
        map.put(head.val,new Object());
        ListNode prev = head;
        ListNode node = head.next;

        while (node != null){
            if (map.get(node.val) != null){
                if (node.next == null){
                    prev.next = null;
                    break;
                }else{
                    prev.next = node.next;
                }
            }else{
                prev = node;
                map.put(node.val,new Object());
            }
            node = node.next;
        }
        return head;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static void main(String args[]){

    }
}