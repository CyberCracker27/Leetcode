// Last updated: 7/25/2026, 7:00:57 AM
1class Solution {
2    public long zeroFilledSubarray(int[] nums) {
3        long count=0,streak=0;
4        for(int num:nums){
5            streak=(num==0)?streak+1:0;
6            count+=streak;
7        }
8        return count;
9    }
10}