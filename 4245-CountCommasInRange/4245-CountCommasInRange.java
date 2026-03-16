// Last updated: 16/03/2026, 21:09:55
class Solution {
    public int countCommas(int n) {
        if(n<1000){
            return 0;
        }else{
            return n-1000+1;
        }
    }
}