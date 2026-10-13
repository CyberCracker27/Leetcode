// Last updated: 10/13/2026, 6:51:21 AM
1class Solution {
2    public long maxAlternatingSum(int[] nums) {
3        for(int i=0;i<nums.length;i++){
4            nums[i]=nums[i]*nums[i];
5        }
6        int n=nums.length;
7        Arrays.sort(nums);
8        long f=0;
9        for(int i=0;i<n/2;i++){
10            f-=nums[i];
11        }
12        for(int i=n/2;i<n;i++){
13            f+=nums[i];
14        }
15        return f;
16    }
17}