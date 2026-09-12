// Last updated: 9/12/2026, 7:17:53 AM
class Solution {
    public int minimumPrefixLength(int[] nums) {
        int n=nums.length;
        int i=n-1;
        while(i>0 && nums[i-1]<nums[i]){
            i--;
        }
        return i;
    }
}