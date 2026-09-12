// Last updated: 9/12/2026, 7:19:55 AM
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