// Last updated: 7/13/2026, 8:56:03 PM
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> a=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            a.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            a.add(nums2[i]);
        }
        Collections.sort(a);
        if(a.size()%2==0){
            int b=a.size()/2;
            return (double)(a.get(b-1)+a.get(b))/2;
        }else{
            int c=a.size()/2;
            return a.get(c);
        }
    }
}