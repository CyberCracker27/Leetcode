// Last updated: 21/01/2026, 22:07:59
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