# Reverse Linked List

`Easy`

> Adobe, Barclays, Intel, Expedia, Paypal

## Problem Statement

### Given the head of a singly linked list, reverse the list, and return the reversed list.

> Example 1:

```
Input:

1 -> 2 -> 3 -> 4 -> 5

Output:

5 -> 4 -> 3 -> 2 -> 1

```

> Example 2:

```
Input:

head = []

Output:

[]

```

> Constraints:

```
0 <= Number of Nodes <= 5000
-5000 <= Node.val <= 5000
```

## Solution

> Iterative

```java
public static ListNode reverseList(ListNode head) {
    if(head == null || head.next == null) return head;

        ListNode prev = head;
        ListNode cur = head.next;
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

> Recursive

```java
  public ListNode reverseList(ListNode head) {

        if(head == null || head.next == null) return head;

        ListNode headofSub = reverseList(head.next);
        head.next.next = head;
        head.next = null;

        return headofSub;

    }

```
