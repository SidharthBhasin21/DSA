# Longest Palindrome List

`Hard`

> Amazon, Intel, Google, Microsoft

## Problem Statement

### Given a linked list , return the length of the longest palindrome list that is present in the given linked list.

> Example 1:

```
Sample Input:

head = [1 -> 2 -> 3 -> 3 -> 2 -> 4]

Sample Output:

4

Explanation:

2 -> 3 -> 3 -> 2 is the length of the longest palindrome in the list.
```

> Example 2:

```
Sample Input:

head = [1 -> 2 -> 2-> 3 -> 2 -> 4]

Sample Output:

3

Explanation:

2 -> 3 -> 2 is the length of the longest palindrome in the list.
```

> Constraints:

```
Let n be the length of the linked list.

1 <= n <= 1000
```

## Solution

```java
public int maxPalindrome(ListNode head) {
        if(head == null ) return 0;
        if(head.next == null ) return 1;

        ListNode cur = head;
        ListNode prev = null;
        int ans = 0;

        while( cur != null) {
            ListNode next= cur.next;
            cur.next  = prev;

            int exactCenter = countCommon(prev,next);
            int lengthExactCenter= 2* exactCenter +1;

            int notExactCenter = countCommon(cur,next);
            int lengthNotExactCenter = 2 * notExactCenter;

            int larger = Math.max(lengthExactCenter,lengthNotExactCenter);

            ans = Math.max(ans,larger);

            prev = cur;
            cur = next;


        }
        return ans;

    }

    private int countCommon(ListNode A,ListNode B){
        int count  = 0;
        while(A != null && B != null){
            if(A.val == B.val){
                count++;
                A= A.next;
                B = B.next;
            } else break;

        }
        return count;
    }

```
