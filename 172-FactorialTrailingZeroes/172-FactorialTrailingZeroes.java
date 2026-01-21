// Last updated: 21/01/2026, 22:11:04
class Solution {
    public int trailingZeroes(int n) {
        int c=0;
        while(n>0){
            n/=5;
            c+=n;
        }
        return c;
    }
}