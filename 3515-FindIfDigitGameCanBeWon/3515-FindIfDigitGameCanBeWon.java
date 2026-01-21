// Last updated: 21/01/2026, 22:08:17
class Solution {
    public boolean canAliceWin(int[] nums) {
        int c=0;
        int d=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<10){
                c+=nums[i];
            }else{
                d+=nums[i];
            }
        }
        if(c>d || d>c && c!=d){
            return true;
        }else{
            return false;
        }
    }
}