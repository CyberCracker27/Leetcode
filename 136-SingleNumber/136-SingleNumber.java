// Last updated: 21/01/2026, 22:11:10
class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> n=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(!n.add(nums[i])){
                n.remove(nums[i]);
            }
        }
        ArrayList<Integer> list = new ArrayList<>(n);
        return list.get(0);
    }
}