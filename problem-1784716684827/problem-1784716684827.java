// Last updated: 7/22/2026, 4:08:04 PM
1class Solution {
2    public int reverseDegree(String s) {
3        int ans=0,idx=1;
4        for(char ch:s.toCharArray()){
5            ans+=(123-(int)ch)*idx;
6            idx++;
7        }
8        return ans;
9    }
10}