// Last updated: 6/28/2026, 8:40:27 AM
1class Solution {
2    public long maxSum(int[] nums, int k, int mul) {
3        Arrays.sort(nums);
4        long c=0;
5        int i=nums.length-1;
6        while(k>0){
7            if(mul>0){
8                c+=(long)nums[i--]*mul;
9                mul--;
10            }else{
11                c+=nums[i--];
12            }
13            k--;
14        }
15        return c;
16    }
17}