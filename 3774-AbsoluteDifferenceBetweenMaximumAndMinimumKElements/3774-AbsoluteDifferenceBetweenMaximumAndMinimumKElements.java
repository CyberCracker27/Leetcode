// Last updated: 9/12/2026, 7:18:16 AM
class Solution {
    public int absDifference(int[] nums, int k) {
        int lar=0;
        int sma=0;
        Arrays.sort(nums);
        for(int i=0;i<k;i++){
            lar+=nums[nums.length-1-i];
            sma+=nums[i];
        }
        return Math.abs(lar-sma);
    }
}