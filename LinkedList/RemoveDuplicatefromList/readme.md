# Remove Duplicate from List

`Medium`

> IBM, Paypal, Uber

## Problem Statement

### Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.

> Example 1:

```
Input:

head = [-1, -1, 2, 2, 3, 3, 3]

Output:

[-1, 2, 3]

```

> Example 2:

```
Input:

head = [-1, 1, 2, 2]

Output:

[-1, 1, 2]

```

> Constraints:

```
-300 <= node value <= 300

Each list has atmost 100 nodes
```

## Solution

```java
public ListNode deleteDuplicates(ListNode head) {

        ListNode origin = head;
        ListNode temp = head;
        ListNode newHead = null;

        while(origin != null){
            while(origin.next != null && origin.val == origin.next.val ){
               origin  = origin.next;
            }
            if(newHead == null) newHead = temp = origin;
            else {
                temp.next = origin;
                temp = origin;
            }
            origin = origin.next;
        }
        return newHead;
    }
```
