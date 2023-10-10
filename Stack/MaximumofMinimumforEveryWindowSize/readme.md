# Maximum of Minimum for Every Window Size

`Hard`

> Expedia, Intuit, Walmart Global Tech

## Problem Statement

### Given an integer array. The task is to find the maximum of the minimum of every window size in the array.

### `Note:` Window size varies from 1 to the size of the Array.

> Example 1:

```
Input:
N = 7
arr[] = [10,20,30,50,10,70,30]

Output: [70, 30, 20, 10, 10, 10, 10]
```

> Example 2:

```
Input:
N = 3
arr[] = [1, 2, 3]

Output: [3, 2, 1]
```

> Constraints:

```
1 <= N <= 105
1 <= arr[i] <= 106
```

## Solution

```java
public static int[] maxOfMin(int[] arr, int n) {
        int left[] = smallerOnLeft(arr);
        int right[] = smallerOnRight(arr);

        int ans[] = new int[n];

        Arrays.fill(ans,Integer.MIN_VALUE);

        for(int i=0 ;i<n;i++){
            int winLen = right[i]-left[i] -1;
            ans[winLen -1] = Math.max(ans[winLen-1],arr[i]);

        }
        for(int i = n-2;i>=0;i--){
            ans[i] = Math.max(ans[i],ans[i+1]);
        }

        return ans;
    }
    public static int[] smallerOnLeft(int[] A)
    {
        int n = A.length;
        int[] ans = new int[n];
        ArrayDeque<Integer> stack = new ArrayDeque<>();


        // for(int i =0 ; )
        for(int i =0 ;i<n;i++){

            while(!stack.isEmpty() && A[stack.peek()] >= A[i]){
                stack.pop();
            }

            if(stack.isEmpty()){
                ans[i] = -1;
                // stack.push(i);
            } else {
                ans[i] = stack.peek();
                // ans.add(stack.peek());
            }
            stack.push(i);

        }

        return ans;

    }
    public static int[] smallerOnRight(int[] A)
    {
        int n = A.length;
        int[] ans = new int[n];
        ArrayDeque<Integer> stack = new ArrayDeque<>();


        // for(int i =0 ; )
        for(int i =n-1 ;i>=0;i--){

            while(!stack.isEmpty() && A[stack.peek()] >= A[i]){
                stack.pop();
            }

            if(stack.isEmpty()){
                ans[i] = n;
                // stack.push(i);
            } else {
                ans[i] = stack.peek();
                // ans.add(stack.peek());
            }
            stack.push(i);

        }

        return ans;

    }
```
