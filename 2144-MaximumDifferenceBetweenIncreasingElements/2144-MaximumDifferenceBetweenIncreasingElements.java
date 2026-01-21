// Last updated: 21/01/2026, 22:09:00
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