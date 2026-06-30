// Last updated: 6/30/2026, 9:23:49 AM
1class Solution {
2    public int longestConsecutive(int[] nums) {
3        if(nums.length==0) return 0;
4        int max=1;
5        Arrays.sort(nums);
6        int c=1;
7        for(int i=1;i<nums.length;i++){
8            if(nums[i]==nums[i-1]){
9                continue;
10            }
11            if(nums[i-1]+1==nums[i]){
12                c++;
13            }
14            else{
15                if(c>max){
16                    max=c;
17                }
18                c=1;
19            }
20        }
21        max=Math.max(max,c);
22        return max;
23    }
24}