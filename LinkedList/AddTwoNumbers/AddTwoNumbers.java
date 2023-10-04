package LinkedList.AddTwoNumbers;

import LinkedList.ListNode;

public class AddTwoNumbers {
    public static void main(String[] args) {

    }

    public ListNode addTwoNumbers(ListNode A, ListNode B) {
        ListNode aList = reverse(A);
        ListNode bList = reverse(B);
        ListNode ans = null;
        ListNode temp = null;

        int carry = 0;
        while (aList != null || bList != null || carry != 0) {
            int sum = carry;
            if (aList != null) {
                sum += aList.val;
                aList = aList.next;
            }
            if (bList != null) {
                sum += bList.val;
                bList = bList.next;
            }
            int digit = sum % 10;
            carry = sum / 10;
            ListNode node = new ListNode(digit);
            if (ans == null) {
                ans = temp = node;
            } else {
                temp.next = node;
                temp = node;
            }
        }
        return reverse(ans);
    }

    private ListNode reverse(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode cur = head;
        ListNode prev = head.next;
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
