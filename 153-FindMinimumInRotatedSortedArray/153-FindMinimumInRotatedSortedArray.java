// Last updated: 7/13/2026, 8:53:54 PM
class Solution {
    public int findMin(int[] nums) {
        int left=0,right=nums.length-1;
        while(left<right){
            int m=(left+right)/2;
            if(nums[right]<nums[m]) left=m+1;
            else right=m;
        }
        return nums[right];
    }
}