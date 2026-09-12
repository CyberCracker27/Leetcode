// Last updated: 9/12/2026, 7:19:42 AM
class Solution {
    public int minOperations(int[] nums, int k) {
        int sum=0;
        for(int num:nums){
            sum+=num;
        }
        return sum%k;
    }
}