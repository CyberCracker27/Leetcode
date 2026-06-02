// Last updated: 6/2/2026, 9:04:13 AM
1class Solution {
2    public int findMaxConsecutiveOnes(int[] nums) {
3        int max=0;
4        int c=0;
5        for(int i=0;i<nums.length;i++){
6            if(nums[i]==1){
7                c++;
8            }else{
9                c=0;
10            }
11            if(c>max){
12                max=c;
13            }
14        }
15        return max;
16    }
17}