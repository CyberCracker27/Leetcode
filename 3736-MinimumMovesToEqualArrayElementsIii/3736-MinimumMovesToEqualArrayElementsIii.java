// Last updated: 9/12/2026, 7:18:35 AM
class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        for(int i=0;i<nums.length;i++){
            int a=nums[nums.length-1]-nums[i];
            sum=sum+a;
        }
        return sum;
    }
}