package LinkedList.ReverseLL;

public class ReverseLL {
    public static void main(String[] args) {

    }

    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode prev = head;
        ListNode cur = head.next;
        head.next = null;

        while (cur != null) {
            ListNode next = cur.next;
            cur.next = prev;

            prev = cur;
            cur = next;

        }
        return prev;

    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
        val = 0;
        next = null;
    }

    ListNode(int val) {
        this.val = val;
        next = null;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
