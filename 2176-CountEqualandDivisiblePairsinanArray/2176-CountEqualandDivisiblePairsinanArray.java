// Last updated: 10/20/2026, 8:51:09 PM
1class Solution {
2    public int countPairs(int[] nums, int k) {
3        int c=0;
4        for(int i=0;i<nums.length;i++){
5            for(int j=i+1;j<nums.length;j++){
6                if(nums[i]==nums[j]){
7                    if((i*j)%k==0){
8                        c++;
9                    }
10                }
11            }
12        }
13        return c;
14    }
15}