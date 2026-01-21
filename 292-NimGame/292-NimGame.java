// Last updated: 21/01/2026, 22:10:48
class Solution {
    public boolean canWinNim(int n) {
        if(n<=3 || n%4!=0 ){
            return true;
        }
        else{
            return false;
        }
    }
}