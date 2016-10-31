package p432;

import java.util.HashMap;

public class AllOne {
    HashMap<String, Node> map = new HashMap<>();
    Node head, tail;

    /**
     * Initialize your data structure here.
     */
    public AllOne() {

    }

    public static void main(String[] args) {
        AllOne allOne = new AllOne();
        allOne.inc("hello");
        allOne.inc("hello");
        allOne.inc("hello");
        allOne.dec("hello");
        allOne.inc("b");
        allOne.inc("c");
        allOne.dec("c");
        System.out.println(allOne.getMinKey());
    }

    public void moveToHead(Node n1, Node n2) {
        Node temp = n1.prev;
        if (n1.prev != null) {
            temp.next = n2;
        }else{
            head = n2;
        }
        n2.prev = temp;
        n1.next = n2.next;
        n1.prev = n2;
        if (n2.next != null) {
            n2.next.prev = n1;
        }
        n2.next = n1;
        Node prev = n2.prev;
        if (prev != null && prev.val < n2.val)
            moveToHead(n2.prev,n2);
    }

    public void moveToTail(Node n1, Node n2) {
        Node prev = n1.prev;
        if (n1.prev != null) {
            prev.next = n2;
        }
        n2.prev = prev;
        n1.next = n2.next;
        n1.prev = n2;
        if (n2.next != null) {
            n2.next.prev = n1;
        }
        Node next = n2.next;
        n2.next = n1;
        if (next != null){
            if (next.val > n1.val){
                moveToTail(n1,next);
            }
        }else{
            tail = n1;
        }
        if (n1 == head){
            head = n2;
        }
    }

    public void deleteNode(Node node) {
        Node prev = node.prev;
        if (prev != null) {
            Node next = node.next;
            prev.next = next;
            if (next != null)
                next.prev = prev;
        }
    }

    /**
     * Inserts a new key <Key> with value 1. Or increments an existing key by 1.
     */
    public void inc(String key) {
        Node node = map.get(key);
        if (node == null) {
            node = new Node(key, 1);
            map.put(key, node);
            if (tail != null) {
                if (node.val <= tail.val) {
                    tail.next = node;
                    node.prev = tail;
                    tail = node;
                }
            }
        } else {
            node.val++;
            Node prev = node.prev;
            if (prev != null) {
                long prevVal = prev.val;
                if (node.val > prevVal) {
                    moveToHead(prev, node);
                    if(node == tail){
                        tail = prev;
                    }
                }
            }
        }
        if (head == null) {
            head = node;
        }
        if (tail == null) {
            tail = node;
            if (head != null) {
                head.next = node;
                if (head != node){
                    node.prev = head;
                }
            }
        }
    }

    /**
     * Decrements an existing key by 1. If Key's value is 1, remove it from the data structure.
     */
    public void dec(String key) {
        Node node = map.get(key);
        if (node == null) {
            return;
        } else {
            if (node.val == 1) {
                map.remove(key);
                deleteNode(node);
                if (head == node) {
                    head = null;
                    if (tail != null) {
                        head = tail;
                    }
                }
                if (tail == node) {
                    if(node.prev != null){
                        tail = node.prev;
                    }else{
                        tail = null;
                    }
                }
            } else {
                node.val--;
                Node next = node.next;
                if (next != null && next.val > node.val) {
                    moveToTail(node, next);
                }
            }
        }
    }

    /**
     * Returns one of the keys with maximal value.
     */
    public String getMaxKey() {
        if (head == null) {
            return "";
        } else {
            return head.key;
        }
    }

    /**
     * Returns one of the keys with Minimal value.
     */
    public String getMinKey() {
        if (tail == null) {
            return "";
        } else {
            return tail.key;
        }
    }

    class Node {
        long val;
        String key;
        Node prev;
        Node next;

        public Node(String key, long val) {
            this.key = key;
            this.val = val;
            this.prev = null;
            this.next = null;
        }

        public Node(long val, Node prev, Node next) {
            this.val = val;
            this.prev = prev;
            this.next = next;
        }
    }
}
