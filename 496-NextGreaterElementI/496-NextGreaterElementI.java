// Last updated: 21/01/2026, 22:10:07
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int a[]=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            int f=0;
            a[i]=-1;
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    f=1;
                }
                if(f==1 && nums2[j]>nums1[i]){
                    a[i]=nums2[j];
                    break;
                }
            }
        }
        return a;
    }
}