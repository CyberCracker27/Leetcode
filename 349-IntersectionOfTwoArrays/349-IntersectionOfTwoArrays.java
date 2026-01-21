// Last updated: 21/01/2026, 22:10:28
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j] && !s.contains(nums1[i])){
                    s.add(nums1[i]);
                }
            }
        }
        int num[]=new int[s.size()];
        int index=0;
        for(Integer j:s){
            num[index++]=j;
        }
        return num;
    }
}