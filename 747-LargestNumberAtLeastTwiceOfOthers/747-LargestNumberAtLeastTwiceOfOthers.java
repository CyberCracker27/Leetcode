// Last updated: 9/12/2026, 7:39:47 AM
class Solution {
    public int dominantIndex(int[] nums) {
        int max=0;
        int b=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
                b=i;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(i!=b){
                if(nums[i]*2>max){
                    return -1;
                }
            }
        }
        return b;
    }
}