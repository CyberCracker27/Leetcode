// Last updated: 21/01/2026, 22:08:49
class Solution {
    public int commonFactors(int a, int b) {
        int c=0;
        int d=(a<b)?a:b;
        for(int i=1;i<=d;i++){
            if(a%i==0 && b%i==0){
                c++;
            }
        }
        return c;
    }
}