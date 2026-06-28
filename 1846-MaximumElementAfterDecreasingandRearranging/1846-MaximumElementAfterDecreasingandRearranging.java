// Last updated: 6/28/2026, 8:59:42 AM
1class Solution {
2    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
3        
4        Arrays.sort(arr);
5        int c=arr[0];
6        for(int i=1;i<arr.length;i++){
7            int a=Math.abs(arr[i-1]-arr[i]);
8            if(a>1){
9                arr[i]=arr[i-1]+1;
10            }
11            System.out.println(arr[i]);
12            c=Math.max(c,arr[i]);
13        }
14        if(c>arr.length){
15            c=arr.length;
16        }
17        return c;
18    }
19}