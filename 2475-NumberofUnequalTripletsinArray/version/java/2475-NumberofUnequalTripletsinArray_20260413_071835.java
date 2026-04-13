// Last updated: 13/04/2026, 07:18:35
1class Solution {
2    public int unequalTriplets(int[] nums) {
3        int c=0;
4        for(int i=0;i<nums.length;i++){
5            for(int j=i+1;j<nums.length;j++){
6                for(int k=j+1;k<nums.length;k++){
7                    if(nums[i]!=nums[j] && nums[i]!=nums[k] && nums[j]!=nums[k]){
8                        c++;
9                    }
10                }
11            }
12        }
13        return c;
14    }
15}