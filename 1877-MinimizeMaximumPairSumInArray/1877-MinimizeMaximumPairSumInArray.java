// Last updated: 9/12/2026, 7:28:12 AM
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