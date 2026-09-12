// Last updated: 9/12/2026, 7:36:29 AM
class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> map1=new HashSet<>();
        Set<Integer> map2=new HashSet<>();
        List<List<Integer>> li2=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            map1.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            map2.add(nums2[i]);
        }
        List<Integer> li=new ArrayList<>();
        for(int x:map1){
            if(!map2.contains(x)){
                li.add(x);
            }
        }
        
        li2.add(li);
        li=new ArrayList<>();
        for(int x:map2){
            if(!map1.contains(x)){
                li.add(x);
            }
        }
        li2.add(li);
        return li2;
    }
}