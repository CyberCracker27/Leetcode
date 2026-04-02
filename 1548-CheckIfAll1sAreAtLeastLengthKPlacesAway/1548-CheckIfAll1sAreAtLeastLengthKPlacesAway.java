// Last updated: 02/04/2026, 07:35:37
class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int c=0;
        int a=0;
        while(a<nums.length-1 && nums[a++]!=1){
            continue;
        }
        for(int i=a;i<nums.length;i++){
            if(nums[i]==1){
                if(c<k) return false;
                c=0;
            }else{
                c++;
            }
        }
        return true;
    }
}