// Last updated: 12/03/2026, 22:13:18
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<=nums.length-k;i++){
            int sum=nums[i];
            for(int j=i+1;j<nums.length&&j<i+k;j++){
                sum+=nums[j];
            }
            if(sum>max){
                max=sum;
            }
        }
        return (double)max/k;
    }
}