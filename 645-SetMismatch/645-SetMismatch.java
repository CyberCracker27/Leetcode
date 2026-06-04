// Last updated: 6/4/2026, 2:06:58 PM
1class Solution {
2    public int[] smallerNumbersThanCurrent(int[] nums) {
3        int arr[]=new int[nums.length];
4        for(int i=0;i<nums.length;i++){
5            int c=0;
6            for(int j=0;j<nums.length;j++){
7                if(nums[j]<nums[i]){
8                    c++;
9                }
10            }
11            arr[i]=c;
12        }
13        return arr;
14    }
15}