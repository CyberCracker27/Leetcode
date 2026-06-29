// Last updated: 6/29/2026, 2:08:55 PM
1class Solution {
2    public int[] searchRange(int[] nums, int target) {
3        int arr[]=new int[2];
4        arr[0]=-1;
5        arr[1]=-1;
6        int left=0,right=nums.length-1;
7        while(left<=right){
8            int mid=(left+right)/2;
9            if(nums[mid]==target){
10                arr[0]=mid;
11                right=mid-1;
12            }
13            else if(nums[mid]<target){
14                left=mid+1;
15            }else{
16                right=mid-1;
17            }
18        }
19        left=0;
20        right=nums.length-1;
21        while(left<=right){
22            int mid=(left+right)/2;
23            if(nums[mid]==target){
24                arr[1]=mid;
25                left=mid+1;
26            }
27            else if(nums[mid]>target){
28                right=mid-1;
29            }else{
30                left=mid+1;
31            }
32        }
33
34        return arr;
35    }
36}