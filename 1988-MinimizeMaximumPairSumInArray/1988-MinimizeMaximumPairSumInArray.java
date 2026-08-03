// Last updated: 8/3/2026, 9:27:47 AM
class Solution {
    public int minPairSum(int[] nums) {
        int max=Integer.MIN_VALUE;
        Arrays.sort(nums);
        int i=0,j=nums.length-1;
        while(i<j){
            int sum=nums[i]+nums[j];
            if(sum>max){
                max=sum;
            }
            i++;
            j--;
        }
        return max;
    }
}