// Last updated: 21/01/2026, 22:08:51
class Solution {
    public int smallestEvenMultiple(int n) {
        if(n%2==0){
            return n;
        }else{
            return n*2;
        }
    }
}