// Last updated: 12/03/2026, 22:13:40
class Solution {
    public int rob(int[] nums) {
        int sum1=0;
        int sum2=0;
        for(int i=0;i<nums.length;i++){
            int newrob=sum2+nums[i];
            int newnorob=Math.max(sum1,sum2);
            sum1=newrob;
            sum2=newnorob;
        }
        return (sum1>sum2)?sum1:sum2;
    }
}