// Last updated: 11/04/2026, 07:43:36
class Solution {
    public int largestInteger(int[] nums, int k) {
        int max=-1;
        for(int i=0;i<nums.length;i++){
            int c=0;
            for(int j=0;j+k<=nums.length;j++){
                boolean l=false;
                for(int f=j;f<j+k;f++){
                    if(nums[i]==nums[f]){
                        l=true;
                        break;    
                    }
                }
                if(l){
                    c++;
                }
            }
            if(c==1 && nums[i]>max){
                max=nums[i];
            }
        }
        return max;
    }
}