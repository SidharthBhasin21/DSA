# Longest Common Prefix

`Easy`

> Atlassian, Bloomberg, Flipkart

## Problem Statement

### Write a function to find the longest common prefix string amongst an array of strings. If there is no common prefix, return an empty string.

> Example 1:

```
Input:

["hello","help","heskel"]

Output:

“he”

```

> Example 2:

```
Input:

["prime","protect","promo"]


Output:

“pr”

```

```
Constraints:
1 <= |strs| <= 200
0 <= |strs[i]| <=200

```

## Solution

```java

    public static String longestCommonPrefix(String[] strs) {
        String ans = strs[0];
        for (int i = 1; i < strs.length; i++) {
            String temp = "";
            for (int j = 0; j < ans.length(); j++) {
                if (j < strs[i].length() && strs[i].charAt(j) == ans.charAt(j))
                    temp += ans.charAt(j);
            }
            ans = temp;
        }
        return ans;
    }
```
