// Last updated: 9/12/2026, 7:27:10 AM
class Solution {
    public int findMiddleIndex(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            int s=0;
            for(int j=i+1;j<nums.length;j++){
                s+=nums[j];
            }
            if(s==c){
                return i;
            }
            c+=nums[i];
        }
        if(nums.length==1){
            return 0;
        }
        return -1;
    }
}