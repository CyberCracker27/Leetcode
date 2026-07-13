// Last updated: 7/13/2026, 8:54:18 PM
class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        int max=1;
        Arrays.sort(nums);
        int c=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                continue;
            }
            if(nums[i-1]+1==nums[i]){
                c++;
            }
            else{
                if(c>max){
                    max=c;
                }
                c=1;
            }
        }
        max=Math.max(max,c);
        return max;
    }
}