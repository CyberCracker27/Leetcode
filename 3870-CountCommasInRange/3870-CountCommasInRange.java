// Last updated: 9/12/2026, 7:17:26 AM
class Solution {
    public int countCommas(int n) {
        if(n<1000){
            return 0;
        }else{
            return n-1000+1;
        }
    }
}