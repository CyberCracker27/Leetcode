// Last updated: 9/12/2026, 7:21:49 AM
class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i+=2){
            int temp=nums[i];
            nums[i]=nums[i+1];
            nums[i+1]=temp;
        }
        return nums;
    }
}