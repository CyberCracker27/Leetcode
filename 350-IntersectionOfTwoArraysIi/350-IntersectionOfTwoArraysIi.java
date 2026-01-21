// Last updated: 21/01/2026, 22:10:26
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> a = new ArrayList<>();
        for (int i : nums1) {
            a.add(i); 
        }
        List<Integer> b=new ArrayList<>();
        for(int i=0;i<nums2.length;i++){
            if(a.contains(nums2[i])){
                b.add(nums2[i]);
                a.remove(Integer.valueOf(nums2[i]));
            }
        }
        int arr[]=new int[b.size()];
        int index=0;
        for(Integer j:b){
            arr[index++]=j;
        }
        return arr;
    }
}