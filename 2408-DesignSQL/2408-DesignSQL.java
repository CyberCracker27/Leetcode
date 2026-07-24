// Last updated: 7/24/2026, 6:30:33 AM
1class Solution {
2    public int minPairSum(int[] nums) {
3        int max=Integer.MIN_VALUE;
4        Arrays.sort(nums);
5        int i=0,j=nums.length-1;
6        while(i<j){
7            int sum=nums[i]+nums[j];
8            if(sum>max){
9                max=sum;
10            }
11            i++;
12            j--;
13        }
14        return max;
15    }
16}