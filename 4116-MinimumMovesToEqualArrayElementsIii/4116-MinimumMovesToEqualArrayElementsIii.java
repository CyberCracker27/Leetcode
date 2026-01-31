// Last updated: 31/01/2026, 07:57:37
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