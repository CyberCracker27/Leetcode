// Last updated: 7/13/2026, 8:52:55 PM
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int arr[]=new int[nums.length];
        int pre=1;
        for(int i=0;i<nums.length;i++){
            arr[i]=1;
        }
        for(int i=0;i<nums.length;i++){
            arr[i]*=pre;
            pre*=nums[i];
        }
        int suf=1;
        for(int i=nums.length-1;i>=0;i--){
            arr[i]*=suf;
            suf*=nums[i];
        }
        return arr;
    }
}