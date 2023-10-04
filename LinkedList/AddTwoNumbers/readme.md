# Add Two Numbers as Lists

`Medium`

> Adobe, Flipkart, Visa

## Problem Statement

### Two linked lists that represent two non-negative numbers are provided to you. Each of the digits' nodes has a single digit, and they are kept in reverse order. A linked list will be returned after adding the two numbers. Ensure that the output list contains no trailing zeros.

> Example 1:

```
Input:

List1: 1 -> 2 -> 3

List2: 5 -> 6 -> 4

Output:

Resultant List: 6->8->7

```

> Example 2:

```
Input:

List1: 1 -> 2 -> 3

List2: 4

Output:

Resultant List: 5 -> 2 -> 3

```

> Constraints:

```
1 <= Length of Linked Lists <= 10^6
```

## Solution

```java
public ListNode addTwoNumbers(ListNode A, ListNode B) {
        ListNode aList = reverse(A);
        ListNode bList = reverse(B);
        ListNode ans = null;
        ListNode temp = null;


        int carry =0;
        while(aList != null || bList != null || carry != 0){
            int sum =carry;
            if(aList != null ){
                sum += aList.val;
                aList = aList.next;
            }
            if(bList != null ){
                sum += bList.val;
                bList = bList.next;
            }
            int digit = sum % 10;
            carry = sum / 10;
            ListNode node = new ListNode(digit);
            if(ans == null){
                ans = temp = node;
            } else {
                temp.next = node;
                temp = node;
            }
        }
            return reverse(ans);
	}
    private ListNode reverse(ListNode head){
        if(head == null || head.next == null) return head;

        ListNode cur = head;
        ListNode prev = head.next;
        head.next = null;

        while(cur != null){
        ListNode next = cur.next;
        cur.next = prev;
        prev = cur;
        cur = next;
        }
        return prev;
    }
```
