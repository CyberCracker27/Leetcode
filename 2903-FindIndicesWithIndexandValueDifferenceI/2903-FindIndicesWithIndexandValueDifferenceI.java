// Last updated: 8/8/2026, 6:54:35 AM
1class Solution {
2    public int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
3        int arr[]={-1,-1};
4        for(int i=0;i<nums.length;i++){
5            for(int j=i;j<nums.length;j++){
6                if(Math.abs(i-j)>=indexDifference && Math.abs(nums[i]-nums[j])>=valueDifference){
7                    arr[0]=i;
8                    arr[1]=j;
9                }
10            }
11        }
12        return arr;
13    }
14}