// Last updated: 21/01/2026, 22:09:59
class Solution {
    public boolean hasAlternatingBits(int n) {
        while(n!=0){
            int last=n&1;
            int ls=(n>>1)&1;
            if((last^ls)==0) return false;
            n>>=1;
        }
        return true;
    }
}