// Last updated: 21/01/2026, 22:10:40
class Solution {
    public boolean isPowerOfFour(int n) {
        return n>0 &&((n&(n-1))==0)&(n&0b01010101010101010101010101010101)!=0;
    }
}