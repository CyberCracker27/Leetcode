// Last updated: 9/12/2026, 7:24:56 AM
class Solution {
    public int triangularSum(int[] nums) {
        for(int n=nums.length;n>1;n--){
            for(int i=0;i<n-1;i++){
                nums[i]=(nums[i]+nums[i+1])%10;
            }
        }
        return nums[0];
    }
}