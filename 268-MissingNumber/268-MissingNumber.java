// Last updated: 21/01/2026, 22:10:52
class Solution {
    public int missingNumber(int[] nums) {
        int e=0;
        for(int i=0;i<=nums.length;i++){
            boolean a=true;
            for(int j=0;j<nums.length;j++){
                if(i==nums[j]){
                    a=false;
                    break;
                }
            }
            if(a){
                e=i;
            }
        }
        return e;
    }
}