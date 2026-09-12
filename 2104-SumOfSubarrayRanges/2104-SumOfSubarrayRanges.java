// Last updated: 9/12/2026, 7:26:04 AM
class Solution {
    public long subArrayRanges(int[] nums) {
        long c=0;
        for(int i=0;i<nums.length;i++){
            int max=nums[i];
            int min=nums[i];
            for(int j=i+1;j<nums.length;j++){
                max=Math.max(max,nums[j]);
                min=Math.min(min,nums[j]);
                c+=max-min;
            }
        }
        return c;
    }
}