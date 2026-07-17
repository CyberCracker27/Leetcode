// Last updated: 7/17/2026, 6:45:41 AM
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