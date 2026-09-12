// Last updated: 9/12/2026, 7:28:14 AM
class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int c=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                int d=Math.abs(i-start);
                if(d<c){
                    c=d;
                }
            }
        }
        return c;
    }
}