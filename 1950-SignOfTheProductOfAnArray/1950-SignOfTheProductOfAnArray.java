// Last updated: 21/01/2026, 22:09:17
class Solution {
    public int arraySign(int[] nums) {
        int sign=1;
        for(int n:nums){
            if(n==0){
                return 0;
            }
            if(n<0){
                sign=-sign;
            }
        }
        return sign;
    }
}