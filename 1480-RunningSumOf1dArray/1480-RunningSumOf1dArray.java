// Last updated: 9/12/2026, 7:34:07 AM
class Solution {
    public int[] runningSum(int[] nums) {
        int a[]=new int[nums.length];
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            a[i]=sum;
        }
        return a;
    }
}