// Last updated: 21/01/2026, 22:11:21
class Solution {
    public int searchInsert(int[] nums, int target) {
        int index=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>target&&nums[i-1]<target){
                index=i;
                break;
            }else if(nums[i]==target){
                index=i;
                break;
            }
        }
        if(nums[nums.length-1]<target){
            index=nums.length;
        }
        return index;
    }
}