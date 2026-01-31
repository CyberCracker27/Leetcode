// Last updated: 31/01/2026, 07:57:57
class Solution {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        int c=-1;
        int d=Math.abs(nums[i]);
        if(nums[i]>=0){
            return c;
        }
        for(int j=0;j<nums.length;j++){
            if(Arrays.binarySearch(nums,d) >= 0){
                return d;
            }else{
                i++;
                if(i<nums.length && nums[i]<0){
                    d=Math.abs(nums[i]);
                }
            }
        }
        return c;
    }
}