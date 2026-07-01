// Last updated: 7/1/2026, 11:30:23 AM
1class Solution {
2    public int numOfSubarrays(int[] arr, int k, int threshold) {
3        int c=0;
4        int j=-1;
5        int f=0;
6        for(int i=0;i<arr.length;i++){
7            c+=arr[i];
8            if(i>=k-1){
9                if(c/k>=threshold){
10                    f++;
11                }
12                j++;
13
14                c-=arr[j];
15            }
16        }
17        return f;
18    }
19}