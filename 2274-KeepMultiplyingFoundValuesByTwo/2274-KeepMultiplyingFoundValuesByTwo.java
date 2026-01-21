// Last updated: 21/01/2026, 22:08:56
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