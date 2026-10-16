// Last updated: 10/16/2026, 7:06:35 AM
1class Solution {
2    public int[] concatWithReverse(int[] nums) {
3        int arr[]=new int[nums.length*2];
4        int c=0;
5        for(int i=0;i<nums.length;i++){
6            arr[c++]=nums[i];
7        }
8        for(int i=nums.length-1;i>=0;i--){
9            arr[c++]=nums[i];
10        }
11        return arr;
12    }
13}