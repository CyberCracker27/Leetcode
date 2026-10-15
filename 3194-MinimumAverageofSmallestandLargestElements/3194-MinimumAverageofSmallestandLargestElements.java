// Last updated: 10/15/2026, 7:10:22 AM
1class Solution {
2    public double minimumAverage(int[] nums) {
3        Arrays.sort(nums);
4        int i=0,j=nums.length-1;
5        double f=Double.MAX_VALUE;
6        while(i<j){
7            double c=(double)(nums[i]+nums[j])/2;
8            i++;
9            j--;
10            if(c<f){
11                f=c;
12            }
13        }
14        return f;
15    }
16}