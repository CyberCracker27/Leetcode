// Last updated: 9/12/2026, 7:17:21 AM
class Solution {
    public boolean uniformArray(int[] nums) {
        int smallestodd=Integer.MAX_VALUE;
        for(int num:nums){
            if(num%2==1){
                smallestodd=Math.min(smallestodd,num);
            }
        }
        if(smallestodd==Integer.MAX_VALUE){
            return true;
        }
        for(int num:nums){
            if(num%2==0 && num<=smallestodd){
                return false;
            }
        }
        return true;
    }
}