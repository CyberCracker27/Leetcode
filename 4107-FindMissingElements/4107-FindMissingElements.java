// Last updated: 21/01/2026, 22:08:09
class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> a=new ArrayList<>();
        Arrays.sort(nums);
        int j=0;
        for(int i=nums[0];i<nums[nums.length - 1];i++){
            if(i!=nums[j]){
                a.add(i);
                continue;
            }
            j++;
        }
        return a;
    }
}