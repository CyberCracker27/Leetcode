// Last updated: 6/3/2026, 10:31:46 AM
1class Solution {
2    public void rotate(int[] nums, int k) {
3        int n=nums.length;
4        k=k%n;
5        reverse(nums,0,n-1);
6        reverse(nums,0,k-1);
7        reverse(nums,k,n-1);
8    }
9    void reverse(int[] nums,int left,int right){
10        while(left<right){
11            int temp=nums[left];
12            nums[left]=nums[right];
13            nums[right]=temp;
14            left++;
15            right--;
16        }
17    }
18}