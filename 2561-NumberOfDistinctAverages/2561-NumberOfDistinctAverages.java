// Last updated: 8/3/2026, 9:26:16 AM
class Solution {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        Set<Double> arr=new HashSet<>();
        int left=0,right=nums.length-1;
        while(left<right){
            arr.add((double)(nums[left]+nums[right])/2);
            left++;
            right--;
        }
        return arr.size();
    }
}