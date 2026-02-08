// Last updated: 08/02/2026, 08:53:27
1class Solution {
2    public int dominantIndices(int[] nums) {
3        int c=0;
4        for(int i=0;i<nums.length;i++){
5            int sum=0;
6            for(int j=i+1;j<nums.length;j++){
7                sum+=nums[j];
8            }
9            int n=nums.length-1-i;
10            if(i!=nums.length-1 && nums[i]>sum/n){
11                c++;
12            }
13        }
14        return c;
15    }
16}