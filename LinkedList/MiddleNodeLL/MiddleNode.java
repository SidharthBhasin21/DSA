package LinkedList.MiddleNodeLL;

import LinkedList.ListNode;

public class MiddleNode {
    public static void main(String[] args) {

    }

    public static ListNode middleNode(ListNode head) {
        ListNode s = head;
        ListNode f = head;

        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
        }

        return s;

    }
}

// class Node {
// int val;
// Node next;

// public Node(int val) {
// this.val = val;
// this.next = null;
// }

// public Node(int val, Node next) {
// this.val = val;
// this.next = next;
// }
// }