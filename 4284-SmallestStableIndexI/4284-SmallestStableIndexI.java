// Last updated: 21/04/2026, 07:29:50
class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int max=0;
        int c=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
            int min=Integer.MAX_VALUE;
            for(int j=i;j<nums.length;j++){
                if(nums[j]<min){
                    min=nums[j];
                }
            }
            if(max-min<=k){
                c=i;
                break;
            }
        }
        return c;
    }
}