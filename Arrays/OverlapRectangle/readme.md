## Find If Two Rectangle Overlaps

`Easy`

> Amazon,ByteDance ,Walmart Global Tech

## Problem Statement

### A rectangle is represented as a list [x1, y1, x2, y2], where (x1, y1) is the coordinate of its bottom-left corner, and (x2, y2) is the coordinate of its top-right corner. Its top and bottom edges are parallel to the X-axis, and its left and right edges are parallel to the Y-axis. Two rectangles overlap if the area of their intersection is positive. To be clear, two rectangles that only touch at the corner or edges do not overlap. Given two axis-aligned rectangles rec1 and rec2, return true if they overlap, otherwise return false.

> Example 1:

```
Input:

[1, 4, 2, 8]

[1, 3, 2, 4]

Output:

false
```

> Example 2:

```
Input:

[2, 4, 10, 8]

[1, 2, 6, 6]

Output:

true

```

```
Constraints:
-109 <= rec1[i], rec2[i] <= 109

```

## Solution

```java
public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
     return !(rec1[2] <= rec2[0] ||  // left
                rec1[1] >= rec2[3] ||   // top
                rec1[3] <= rec2[1] ||   // bottom
                rec1[0] >= rec2[2]);    // right;
    }
```
