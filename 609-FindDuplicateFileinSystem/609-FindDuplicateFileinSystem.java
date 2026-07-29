// Last updated: 7/29/2026, 6:57:58 AM
1class Solution {
2    public boolean isZeroArray(int[] nums, int[][] queries) {
3        int n=nums.length;
4        int diff[]=new int[n];
5        for(int[] q:queries){
6            int l=q[0];
7            int r=q[1];
8            diff[l]++;
9            if(r+1<n){
10                diff[r+1]--;
11            }
12        }
13        int cnt=0;
14        for(int i=0;i<n;i++){
15            cnt+=diff[i];
16            if(nums[i]>cnt){
17                return false;
18            }
19        }
20        return true;
21    }
22}