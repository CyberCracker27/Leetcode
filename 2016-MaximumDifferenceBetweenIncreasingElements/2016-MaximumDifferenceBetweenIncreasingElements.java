// Last updated: 9/12/2026, 7:26:30 AM
class Solution {
    public int maximumDifference(int[] nums) {
        int c=-1;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]-nums[i]>c&&nums[i]!=nums[j]){
                    c=nums[j]-nums[i];
                }
            }
        }
        return c;
    }
}