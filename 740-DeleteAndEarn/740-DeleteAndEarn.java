// Last updated: 7/13/2026, 8:51:10 PM
class Solution {
    public int deleteAndEarn(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
        }
        int dp[]=new int[max+1];
        for(int i=0;i<nums.length;i++){
            dp[nums[i]]+=nums[i];
        }
        int a=0;
        int b=0;
        int m=0;
        for(int i=0;i<dp.length;i++){
            m=Math.max(a,b+dp[i]);
            b=a;
            a=m;
        }
        return (a>b)?a:b;
    }
}