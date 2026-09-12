// Last updated: 9/12/2026, 7:35:30 AM
class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            a.add(index[i],nums[i]);
        }
        int[] target=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            target[i]=a.get(i);
        }
        return target;
    }
}