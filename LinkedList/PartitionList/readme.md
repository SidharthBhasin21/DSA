# Partition List

`Hard`

> eBay, Flipkart, Goldman Sachs

## Problem Statement

### Given a linked list A and a value B, partition it such that all nodes less than B come before nodes greater than or equal to B. You should preserve the original relative order of the nodes in each of the two partitions.

> Example 1:

```
Input:

A = [1, 4, 3, 2, 5, 2]
B = 3

Output:

[1, 2, 2, 4, 3, 5]

```

> Example 2:

```
Input:

A = [1, 2, 3, 1, 3]
B = 2

Output:

[1, 1, 2, 3, 3]
```

> Constraints:

```
1 <= |A| <= 106

1 <= A[i], B <= 109
```

## Solution

```java

public ListNode partition(ListNode head, int x) {

        if(head == null || head.next == null) return head;

        ListNode sHead = new ListNode(-1);
        ListNode lHead = new ListNode(-1);

        ListNode sTail = sHead;
        ListNode lTail = lHead;

        ListNode cur  = head;

        while(cur!= null){
            if(cur.val < x){
                sTail.next = cur;
                sTail = cur;
            } else {
                 lTail.next =cur;
                 lTail = cur;
            }
            cur = cur.next;

        }

        sTail.next = lHead.next;
        lTail.next = null;

        return sHead.next;

	}
```
