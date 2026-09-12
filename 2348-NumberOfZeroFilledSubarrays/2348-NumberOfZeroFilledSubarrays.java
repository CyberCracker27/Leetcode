// Last updated: 9/12/2026, 7:24:39 AM
class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long count=0,streak=0;
        for(int num:nums){
            streak=(num==0)?streak+1:0;
            count+=streak;
        }
        return count;
    }
}