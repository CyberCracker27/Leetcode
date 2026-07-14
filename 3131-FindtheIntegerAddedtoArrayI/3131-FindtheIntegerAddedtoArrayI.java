// Last updated: 7/14/2026, 6:46:43 AM
1class Solution {
2    public int addedInteger(int[] nums1, int[] nums2) {
3        int a=0,b=0;
4        for(int i=0;i<nums1.length;i++){
5            a+=nums1[i];
6            b+=nums2[i];
7        }
8        int c=b-a;
9        return c/nums1.length;
10    }
11}