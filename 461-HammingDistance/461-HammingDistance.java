// Last updated: 21/01/2026, 22:10:08
class Solution {
    public int hammingDistance(int x, int y) {
        int n=x^y;
        int c=0;
        while(n!=0){
            if((n&1)==1){
                c++;
            }
            n>>=1;
        }
        return c;
    }
}