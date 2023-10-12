# Maximal Area

`Hard`

> Bloomberg, IBM, Uber

## Problem Statement

### Given a rows x cols binary matrix filled with 0's and 1's, find the largest rectangle containing only 1's and return its area.

> Example 1:

```
Input:

[[1, 1, 0, 1]
[1, 1, 0, 0]
[1, 1, 0, 1]
[1, 1, 1, 1]]

Output:

8
```

> Example 2:

```
Input:

[[1, 1, 0]
[1, 1, 0]]

Output:

4
```

> Constraints:

```
1 <= rows, cols <= 200
```

## Solution

```java
public int maximalRectangle(char[][] matrix)
  {
      //You can code here


int r=matrix.length;
if(r==0){
  return 0;
}
int c=matrix[0].length;
int his[]=new int[c];
int ans=0;

for(int i=0; i<r; i++){
  for(int j=0; j<c; j++){
    if(matrix[i][j]=='0'){
      his[j]=0;
    }else{
      his[j]++;
    }
  }

  int currMax=largestRectangleArea(his);
  ans=Math.max(ans, currMax);
}

    return ans;
  }

  public int largestRectangleArea(int[] heights)
    {
        //You can code here

    int ans=heights[0];
    int n=heights.length;

    int left[]=smallerOnLeft(heights);
    int right[]=smallerOnRIght(heights);

    for(int i=0; i<n; i++){

      ans=Math.max(ans, heights[i]*(right[i]-left[i]-1));
    }

    return ans;


    }

       static int[] smallerOnLeft(int[] a){

       int n=a.length;
      int ans[] =new int[n];

        ArrayDeque<Integer> s=new ArrayDeque<>();
        for(int i=0; i<n; i++){

          while(!s.isEmpty() && a[s.peek()]>=a[i]){
            s.pop();
          }
          if(s.isEmpty()){
            ans[i]=-1;
          }else{
            ans[i]=s.peek();
          }

          s.push(i);
        }
return ans;
    }

      static int[] smallerOnRIght(int[] a){

       int n=a.length;
      int ans[] =new int[n];

        ArrayDeque<Integer> s=new ArrayDeque<>();
        for(int i=n-1; i>=0; i--){

          while(!s.isEmpty() && a[s.peek()]>=a[i]){
            s.pop();
          }
          if(s.isEmpty()){
            ans[i]=n;
          }else{
            ans[i]=s.peek();
          }

          s.push(i);
        }
        return ans;
    }

```
