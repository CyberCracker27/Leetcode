// Last updated: 9/12/2026, 7:20:23 AM
class Solution {
    public int countSubarrays(int[] nums) {
        int a=0;
        for(int i=0;i<=nums.length-3;i++){
           if(2*(nums[i]+nums[i+2])==nums[i+1]){
             a++;
           }
        }
        return a;
    }
}