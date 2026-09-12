// Last updated: 9/12/2026, 7:17:42 AM
class Solution {
    public int dominantIndices(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i+1;j<nums.length;j++){
                sum+=nums[j];
            }
            int n=nums.length-1-i;
            if(i!=nums.length-1 && nums[i]>sum/n){
                c++;
            }
        }
        return c;
    }
}