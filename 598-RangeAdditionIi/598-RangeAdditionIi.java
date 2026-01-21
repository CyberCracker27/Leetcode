// Last updated: 21/01/2026, 22:10:02
class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        int mn=m;
        int mx=n;
        for(int[] v:ops){
            mn=Math.min(mn,v[0]);
            mx=Math.min(mx,v[1]);
        }
        return mx*mn;
    }
}