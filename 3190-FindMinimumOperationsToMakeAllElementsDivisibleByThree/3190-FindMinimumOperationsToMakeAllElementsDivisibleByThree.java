// Last updated: 9/12/2026, 7:20:56 AM
class Solution {
    public int minimumOperations(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%3==0){
                continue;
            }else{
                sum++;
            }
        }
        return sum;
    }
}