// Last updated: 21/01/2026, 22:08:12
class Solution {
    public int minOperations(int[] nums, int k) {
        int sum=0;
        for(int num:nums){
            sum+=num;
        }
        return sum%k;
    }
}