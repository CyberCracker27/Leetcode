// Last updated: 21/01/2026, 22:10:11
class Solution {
    public int arrangeCoins(int n) {
        int c=1;
        while(n>=c){
            n-=c;
            c++;
        }
        return c-1;
    }
}