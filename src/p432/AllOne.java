package p432;

import java.util.HashMap;

public class AllOne {
    HashMap<String, Node> map = new HashMap<>();
    Node head,tail;

    class Node{
        long val;
        String key;
        Node prev;
        Node next;
        public Node(String key,long val){
            this.key = key;
            this.val = val;
            this.prev = null;
            this.next = null;
        }
        public Node(long val,Node prev,Node next){
            this.val = val;
            this.prev = prev;
            this.next = next;
        }
    }

    public void switchNode(Node n1,Node n2){
        if (n1.prev != null){
            Node temp = n1.prev;
            temp.next = n2;
            n2.prev = temp;
        }
        n1.next = n2.next;
        n2.next = n1;
    }

    public void deleteNode(Node node){
        Node temp = node.prev;
        if (temp != null){
            Node next = node.next;
            temp.next = next;
            next.prev = temp;
        }
    }
    /**
     * Initialize your data structure here.
     */
    public AllOne() {

    }

    /**
     * Inserts a new key <Key> with value 1. Or increments an existing key by 1.
     */
    public void inc(String key) {
        Node node = map.get(key);
        if (node == null){
            node = new Node(key,1);
            map.put(key,node);
            if (tail != null){
                if (node.val <= tail.val){
                    tail.next = node;
                    node.prev = tail;
                    tail = node;

                }
            }
        }else{
            node.val++;
            Node prev = node.prev;
            if (prev != null){
                long prevVal = prev.val;
                if (node.val > prevVal){
                    switchNode(node,prev);
                    if (prev == head){
                        head = node;
                    }
                }
            }
        }
        if(head == null){
            head = node;
        }
        if(tail == null){
            tail = node;
            if (head != null){
                head.next = node;
                node.prev = head;
            }
        }
    }

    /**
     * Decrements an existing key by 1. If Key's value is 1, remove it from the data structure.
     */
    public void dec(String key) {
        int num = 0;
        Node node = map.get(key);
        if (node == null) {
            return;
        } else {
            if (node.val == 1) {
                map.remove(key);
                deleteNode(node);
                if(head == node){
                    head = null;
                    if (tail != null){
                        head = tail;
                    }
                }
                if (tail == node){{
                    tail = null;
                }}
            } else {
                node.val--;
            }
        }
    }

    /**
     * Returns one of the keys with maximal value.
     */
    public String getMaxKey() {
        if(head == null){
            return "";
        }else{
            return head.key;
        }
    }

    /**
     * Returns one of the keys with Minimal value.
     */
    public String getMinKey() {
        if (tail == null){
            return "";
        }else{
            return tail.key;
        }
    }

    public static void main(String[] args){
        AllOne allOne = new AllOne();
        allOne.inc("hello");
        allOne.inc("goodsbye");
        allOne.inc("hello");
        allOne.inc("hello");
        allOne.inc("leet");
        allOne.inc("code");
        allOne.inc("leet");
        allOne.inc("hello");
        allOne.dec("hello");
        allOne.inc("leet");
        allOne.inc("code");
        allOne.inc("code");
        System.out.println(allOne.getMaxKey());
    }
}
