// Last updated: 6/2/2026, 8:56:16 AM
1class Solution {
2    public int[] getConcatenation(int[] nums) {
3        int[] arr1=new int[2*nums.length];
4        for(int i=0;i<nums.length;i++){
5            arr1[i]=nums[i];
6            arr1[nums.length+i]=nums[i];
7        }
8        return arr1;
9    }
10}