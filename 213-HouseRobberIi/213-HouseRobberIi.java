// Last updated: 7/13/2026, 8:53:10 PM
class Solution {
    public int rob(int[] nums) {
        int a=0,b=0,m1=0,m2=0;
        for(int i=0;i<nums.length-1;i++){
            m1=Math.max(a,b+nums[i]);
            b=a;
            a=m1;
        }
        a=0;
        b=0;
        for(int i=1;i<nums.length;i++){
            m2=Math.max(a,b+nums[i]);
            b=a;
            a=m2;
        }
        if(nums.length<=2){
            if(nums.length==1) return nums[0];
            if(nums[0]>nums[1]){
                return nums[0];
            }else{
                return nums[1];
            }
        }
        return (m1>m2)?m1:m2;
    }
}