// Last updated: 02/04/2026, 07:34:40
class Solution {
    public boolean uniformArray(int[] nums1) {
        int odd=0;
        int even=0;
        for(int num:nums1){
            if(num%2==0) even++;
            else odd++;
        }
        if(odd==nums1.length || even==nums1.length){
            return true;
        }
        return even>0 && odd>0;
    }
}