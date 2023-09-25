# Kth Node From Middle

`Easy`

> Airbnb, Visa, DE Shaw

## Problem Statement

### Given are an integer B and a linked list A of length N. From the middle of the Linked List A toward the beginning, you must determine the value of the Bth node. Return -1 if such an element is not present. `NOTE`: N is the total number of nodes in the list, and the position of the middle node is (N/2)+1.

> Example 1:

```
Input:
A: 1 -> 2 -> 3 -> 4 -> 5
B: 2

Output:
1

```

> Example 2:

```
Input:
A: 1 -> 2 -> 3 -> 4 -> 5
B: 0

Output:
3
```

> Constraints:

```
1 <= N <= 105
-103 <= Value in Each Link List Node <= 103
0 <= B <= 105
```

## Solution

```java
 public int kthNode(ListNode head, int B) {

        ListNode slow = head;
        ListNode fast = head;
        for (int i = 0; i < B; i++) {
            if (fast != null && fast.next != null) {
                fast = fast.next.next;
            }
            else {
                return -1;
            }
        }

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow.val;
    }
```
