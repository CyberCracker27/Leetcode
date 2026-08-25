// Last updated: 8/25/2026, 7:03:46 AM
1class Solution {
2    public int missingMultiple(int[] nums, int k) {
3        HashSet<Integer> set=new HashSet<>();
4        for(int num:nums) set.add(num);
5        int count=1;
6        int  y=k;
7        while(set.contains(y)){
8            count++;
9            y=k*count;
10        }
11        return y;
12    }
13}