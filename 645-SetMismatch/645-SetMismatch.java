// Last updated: 6/4/2026, 2:03:45 PM
1class Solution {
2    public int[] findErrorNums(int[] nums) {
3        int arr[]=new int[2];
4        Set<Integer> s=new HashSet<>();
5        for(int i=0;i<nums.length;i++){
6            if(!s.add(nums[i])){
7                arr[0]=nums[i];
8            }
9        }
10        for(int i=1;i<=nums.length;i++){
11            if(!s.contains(i)){
12                arr[1]=i;
13            }
14        }
15        return arr;
16    }
17}