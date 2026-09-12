// Last updated: 9/12/2026, 7:22:27 AM
class Solution {
    public int findNonMinOrMax(int[] nums) {
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
            }
            if(nums[i]>max){
                max=nums[i];
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=min && nums[i]!=max){
                return nums[i];
            }
        }
        return -1;
    }
}