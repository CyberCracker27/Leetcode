// Last updated: 9/12/2026, 7:23:17 AM
class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        int small=Integer.MAX_VALUE;
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    if(nums1[i]<small){
                        small=nums1[i];
                    }
                }
                if(nums1[i]*10+nums2[j]<small){
                    small=nums1[i]*10+nums2[j];
                }
                if(nums2[j]*10+nums1[i]<small){
                    small=nums2[j]*10+nums1[i];
                }
            }
        }
        return small;
    }
}