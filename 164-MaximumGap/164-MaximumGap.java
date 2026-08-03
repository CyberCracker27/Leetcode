// Last updated: 8/3/2026, 9:34:32 AM
class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int max=0;
        for(int i=1;i<nums.length;i++){
            int c=nums[i]-nums[i-1];
            if(c>max){
                max=c;
            }
        }
        return max;
    }
}