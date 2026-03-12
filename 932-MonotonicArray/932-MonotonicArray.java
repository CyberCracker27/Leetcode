// Last updated: 12/03/2026, 22:13:11
class Solution {
    public boolean isMonotonic(int[] nums) {
        int temp=nums[nums.length-1];
        boolean right=true,left=true;
        for(int i=nums.length-2;i>=0;i--){
            if(!(temp>=nums[i])){
                right=false;
            }
            temp=nums[i];
        }
        temp=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            if(!(temp<=nums[i])){
                left=false;
            }
            temp=nums[i];
        }
        return (right||left)?true:false;
    }
}