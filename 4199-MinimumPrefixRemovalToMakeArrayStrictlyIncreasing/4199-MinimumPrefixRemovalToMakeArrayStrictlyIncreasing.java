// Last updated: 28/01/2026, 08:09:37
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