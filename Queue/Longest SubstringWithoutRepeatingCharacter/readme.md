# Longest Substring Without Repeating Character

`Medium`

> Apple, IBM, DE Shaw, Uber

## Problem Statement

### Given a string s, find the length of the longest substring without repeating characters.

> Example 1:

```
Input:

s = "abcabcbb"

Output:

3

Explanation:

The Longest substring with non-repeating characters are abc, bca, cab with length 3.
```

> Example 2:

```
Input

s = "aaa"

Output

1
```

```
Constraints:
0 <= |s| <= 5 * 10^4

s consists of English letters, digits, symbols and spaces.
```

## Solution

```java
public int lengthOfLongestSubstring(String S) {
        if(S.length() == 0 || S.length() == 1) return S.length();
        int n = S.length();
        int left =0 ;
        int right = 0;
        int maxLen = Integer.MIN_VALUE;

        Map<Character,Integer> map = new HashMap<>();

        while(right < n ){

        if(map.containsKey(S.charAt(right)))
        left = Math.max(map.get(S.charAt(right)) +1,left);

        map.put(S.charAt(right) , right);

        maxLen = Math.max(maxLen, right - left +1);
        right++;

        }

        return maxLen;
    }
```
