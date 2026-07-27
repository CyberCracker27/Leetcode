// Last updated: 7/27/2026, 7:19:54 AM
class Solution {
    public int reverseDegree(String s) {
        int ans=0,idx=1;
        for(char ch:s.toCharArray()){
            ans+=(123-(int)ch)*idx;
            idx++;
        }
        return ans;
    }
}