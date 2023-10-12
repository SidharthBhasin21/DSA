# Largest Rectangle In Histogram

`Hard`

> Amazon, Google, Microsoft

## Problem Statement

### Given an array of integers of length n , heights where every element of the array represents histogram's bar height and the width of each bar is 1, return the area of the largest rectangle in the histogram.

> Example 1:

![Explaination](https://assets.leetcode.com/uploads/2021/01/04/histogram.jpg)

```
Input:

heights = [2,1,5,6,2,3]

Output:

10


Explanation:

The above is a histogram where width of each bar is 1.

The largest rectangle is shown in the red area, which has an area = 10 units.
```

> Example 2:

![Explaination](https://assets.leetcode.com/uploads/2021/01/04/histogram-1.jpg)

```
Input:

heights = [2 , 4]

Output:
4


Explanation: The largest rectangle is formed by the bars with height 3, 4 and 5 , each will give height 3 to the rectangle. Thus area of the rectangle is 9.
```

> Constraints:

```
1 <= n <= 10^5

0 <= heights[i] <= 10^4
```

## Solution

```java
public int[]rightSmaller(int[] heights){
    int ans[]=new int[heights.length];
     Stack<Integer>st=new Stack<>();
    ans[heights.length-1]=heights.length;
    st.push(heights.length-1);

    for(int i=heights.length-2;i>=0;i--){
          int getNum=heights[i];
        while(!st.isEmpty()&&heights[st.peek()]>=getNum){
          st.pop();
        }
        if(st.isEmpty()){
          ans[i]=heights.length;
          st.push(i);
        }else{
          ans[i]=st.peek();
          st.push(i);
        }
    }
    return ans;
}

public int[]leftSmaller(int[] heights){
  int ans[]=new int[heights.length];
    Stack<Integer>st=new Stack<>();
     ans[0]=-1;
    st.push(0);
    for(int i=1;i<heights.length;i++){
        int getNum=heights[i];
        while(!st.isEmpty()&& heights[st.peek()]>=getNum){
          st.pop();
        }
        if(st.isEmpty()){
          ans[i]=-1;
          st.push(i);
        }else{
          ans[i]=st.peek();
          st.push(i);
        }
    }
    return ans;
}

    public int largestRectangleArea(int[] heights)
    {
        //You can code here
      // Finding Next Greater Element On The Right
      int smalllerRight[]=rightSmaller(heights);
      // Finding Next Greater Element On The Left
      int smallerLeft[]=leftSmaller(heights);
        int ans=0;
      for(int i=0;i<heights.length;i++){
        int len=smalllerRight[i]-smallerLeft[i];
        ans=Math.max((len-1) * heights[i],ans);
      }

    return ans;
    }
```
