// Last updated: 9/12/2026, 7:21:17 AM
class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        int a=0,b=0;
        for(int i=0;i<nums1.length;i++){
            a+=nums1[i];
            b+=nums2[i];
        }
        int c=b-a;
        return c/nums1.length;
    }
}