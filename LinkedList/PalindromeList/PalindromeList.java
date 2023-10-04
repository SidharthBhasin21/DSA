package LinkedList.PalindromeList;

import LinkedList.ListNode;

public class PalindromeList {
    public static void main(String[] args) {
        
    }   

    public int isPalin(ListNode A) {

        ListNode middle = middleNode(head);
        ListNode t2 = reverse(middle);
        ListNode t1 = head;

        while(t2 != null){
            if(t1.val != t2.val) return 0;

            t1 = t1.next;
            t2 = t2.next;

        }
        return 1;
        

    }
    private static ListNode middleNode(ListNode head) {
        ListNode s = head;
        ListNode f = head;

        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
        }

        return s;

    }
    private static ListNode reverse(ListNode head) {
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
