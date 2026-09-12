// Last updated: 9/12/2026, 7:16:33 AM
class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        Arrays.sort(nums);
        long c=0;
        int i=nums.length-1;
        while(k>0){
            if(mul>0){
                c+=(long)nums[i--]*mul;
                mul--;
            }else{
                c+=nums[i--];
            }
            k--;
        }
        return c;
    }
}