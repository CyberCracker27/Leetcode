// Last updated: 9/12/2026, 7:18:04 AM
class Solution {
    public long maximumScore(int[] nums) {
        int n=nums.length;
        long[] suffixmin=new long[n];
        suffixmin[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            suffixmin[i]=Math.min(suffixmin[i+1],nums[i]);
        }
        long prefixsum=0;
        long max=Integer.MIN_VALUE;
        for(int i=0;i<n-1;i++){
            prefixsum+=nums[i];
            max=Math.max(max,prefixsum-suffixmin[i+1]);
        }
        return max;
    }
}