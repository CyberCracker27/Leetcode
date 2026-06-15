// Last updated: 6/15/2026, 4:28:14 PM
1class Solution {
2    public void merge(int[] nums1, int m, int[] nums2, int n) {
3        for(int i=0;i<n;i++){
4            nums1[m+i]=nums2[i];
5        }
6        Arrays.sort(nums1);
7    }
8}