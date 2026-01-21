// Last updated: 21/01/2026, 22:10:51
class Solution {
    public void moveZeroes(int[] nums) {
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                int temp=nums[i];
                nums[i]=0;
                nums[j]=temp;
                j++;
            }
        }
    }
}