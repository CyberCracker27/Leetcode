// Last updated: 04/02/2026, 07:54:03
1class Solution {
2    public double findMaxAverage(int[] nums, int k) {
3        int max=Integer.MIN_VALUE;
4        for(int i=0;i<=nums.length-k;i++){
5            int sum=nums[i];
6            for(int j=i+1;j<nums.length&&j<i+k;j++){
7                sum+=nums[j];
8            }
9            if(sum>max){
10                max=sum;
11            }
12        }
13        return (double)max/k;
14    }
15}