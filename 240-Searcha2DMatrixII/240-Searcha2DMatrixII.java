// Last updated: 6/3/2026, 8:46:26 PM
1class Solution {
2    public boolean search(int[] nums, int target) {
3        int left=0,right=nums.length-1;
4        while(left<=right){
5            int mid=(left+right)/2;
6            if(nums[mid]==target){
7                return true;
8            }
9            if(nums[left]==nums[mid]){
10                left++;
11                continue;
12            }
13            if(nums[left]<=nums[mid]){
14                if(nums[left]<=target && target<nums[mid]){
15                    right=mid-1;
16                }else{
17                    left=mid+1;
18                }
19            }else{
20                if(nums[mid]<target && target<=nums[right]){
21                    left=mid+1;
22                }else{
23                    right=mid-1;
24                }
25            }
26        }
27        return false;
28    }
29}