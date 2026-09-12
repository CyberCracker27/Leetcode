// Last updated: 9/12/2026, 7:25:10 AM
class Solution {
    public int findFinalValue(int[] nums, int original) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(original==nums[i]){
                original*=2;
            }
        }
        return original;
    }
}