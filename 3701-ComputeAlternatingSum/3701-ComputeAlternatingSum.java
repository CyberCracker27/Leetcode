// Last updated: 9/12/2026, 7:18:55 AM
class Solution {
    public int alternatingSum(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                sum+=nums[i];
            }else{
                sum-=nums[i];
            }
        }
        return sum;
    }
}