// Last updated: 7/13/2026, 8:46:10 PM
class Solution {
    public long maxTotalValue(int[] nums, int k) {
        int max=nums[0],min=nums[0];
        for(int i:nums){
            max=Math.max(max,i);
            min=Math.min(min,i);
        }
        return (long)(max-min)*k;
    }
}