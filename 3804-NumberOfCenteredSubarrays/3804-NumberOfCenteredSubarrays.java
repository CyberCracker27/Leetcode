// Last updated: 9/12/2026, 7:18:24 AM
class Solution {
    public int centeredSubarrays(int[] nums) {
       int c=nums.length;
        for(int i=0;i<nums.length;i++){
            int sum=nums[i];
            for(int j=i+1;j<nums.length;j++){
                sum+=nums[j];
                for(int k=i;k<=j;k++){
                    if(sum==nums[k]){
                        c++;
                        break;
                    }
                }
            }
        }
        return c;
    }
}