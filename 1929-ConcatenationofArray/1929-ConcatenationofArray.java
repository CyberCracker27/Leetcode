// Last updated: 6/2/2026, 9:02:01 AM
1class Solution {
2    public int[] shuffle(int[] nums, int n) {
3        int[] arr1=new int[nums.length];
4        int j=0,k=0;
5        for(int i=0;i<nums.length;i++){
6            if(i%2==0){
7                arr1[i]=nums[j++];
8            }else{
9                arr1[i]=nums[k+n];
10                k++;
11            }
12        }
13        return arr1;
14    }
15}