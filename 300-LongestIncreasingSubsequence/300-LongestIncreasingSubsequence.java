// Last updated: 6/6/2026, 1:56:47 PM
1class Solution {
2    public int lengthOfLIS(int[] nums) {
3        int n=nums.length;
4        int arr[]=new int[n];
5        arr[n-1]=1;
6        int max=1;
7        for(int i=n-2;i>=0;i--){
8            int ans=0;
9            for(int j=i+1;j<n;j++){
10                if(nums[i]<nums[j]){
11                    ans=Math.max(ans,arr[j]);
12                }
13            }
14            arr[i]=ans+1;
15            max=Math.max(max,arr[i]);
16        }
17        return max;   
18    }
19}