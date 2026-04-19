// Last updated: 19/04/2026, 08:48:24
1class Solution {
2    public int firstStableIndex(int[] nums, int k) {
3        int max=0;
4        int c=-1;
5        for(int i=0;i<nums.length;i++){
6            if(nums[i]>max){
7                max=nums[i];
8            }
9            int min=Integer.MAX_VALUE;
10            for(int j=i;j<nums.length;j++){
11                if(nums[j]<min){
12                    min=nums[j];
13                }
14            }
15            if(max-min<=k){
16                c=i;
17                break;
18            }
19        }
20        return c;
21    }
22}