# Merge Two Sorted Lists

`Medium`

> Adobe, Flipkart, Netflix, Expedia

## Problem Statement

### You are given the heads of two sorted linked lists list1 and list2. Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists. Return the head of the merged linked list.

> Example 1:

```
Input:

l1 = [-1, 2, 4]

l2 = [-1, 3, 4]

Output:

[-1, -1, 2, 3, 4, 4]

```

> Example 2:

```
Input:

l1 = [-10, 20, 40]

l2 = [-1, 1, 50, 60]

Output:

[-10, -1, 1, 20, 40, 50, 60]

```

> Constraints:

```
-200 <= node value <= 200

Each list has atmost 50 nodes
```

## Solution

```java
public static ListNode mergeTwoLists(ListNode list1, ListNode list2)
    {
       ListNode ansList = new ListNode();
        ListNode head = ansList;

        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                head.next = list1;
                list1 = list1.next;
                head = head.next;
            }

            else{
                head.next = list2;
                list2 = list2.next;
                head = head.next;
            }
        }
        head.next = (list1 != null)? list1: list2;

        return ansList.next;
    }
```
