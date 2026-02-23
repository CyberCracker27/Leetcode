// Last updated: 23/02/2026, 02:12:40
1class Solution {
2    public int dominantIndex(int[] nums) {
3        int max=0;
4        int b=0;
5        for(int i=0;i<nums.length;i++){
6            if(nums[i]>max){
7                max=nums[i];
8                b=i;
9            }
10        }
11        for(int i=0;i<nums.length;i++){
12            if(i!=b){
13                if(nums[i]*2>max){
14                    return -1;
15                }
16            }
17        }
18        return b;
19    }
20}