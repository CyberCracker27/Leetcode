// Last updated: 21/01/2026, 22:10:10
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> s=new HashSet<>();
        for(int i:nums){
            s.add(i);
        }
        Set<Integer> d=new HashSet<>();
        for(int i=1;i<=nums.length;i++){
            if(s.add(i)){
                d.add(i);
            }
        }
        List<Integer> arr=new ArrayList<>();
        for(Integer j:d){
            arr.add(j);
        }
        return arr;
    }
}