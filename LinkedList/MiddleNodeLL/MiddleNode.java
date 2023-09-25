package LinkedList.MiddleNodeLL;

import LinkedList.Node;

public class MiddleNode {
    public static void main(String[] args) {

    }

    public static Node middleNode(Node head) {
        Node s = head;
        Node f = head;

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