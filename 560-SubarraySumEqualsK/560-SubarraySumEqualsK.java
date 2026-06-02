// Last updated: 6/2/2026, 2:21:12 PM
1class Solution {
2    public int subarraySum(int[] nums, int k) {
3        int d=0;
4        for(int i=0;i<nums.length;i++){
5            int c=nums[i];
6            if(c==k) d++;
7            for(int j=i+1;j<nums.length;j++){
8                c+=nums[j];
9                if(c==k){
10                    d++;
11                }
12            }
13        }
14        return d;
15    }
16}