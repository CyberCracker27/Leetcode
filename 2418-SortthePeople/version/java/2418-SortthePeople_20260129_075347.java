// Last updated: 29/01/2026, 07:53:47
1class Solution {
2    public int findMaxK(int[] nums) {
3        Arrays.sort(nums);
4        int i=0;
5        int c=-1;
6        int d=Math.abs(nums[i]);
7        if(nums[i]>=0){
8            return c;
9        }
10        for(int j=0;j<nums.length;j++){
11            if(Arrays.binarySearch(nums,d) >= 0){
12                return d;
13            }else{
14                i++;
15                if(i<nums.length && nums[i]<0){
16                    d=Math.abs(nums[i]);
17                }
18            }
19        }
20        return c;
21    }
22}