// Last updated: 9/12/2026, 7:16:44 AM
class Solution {
    public boolean checkGoodInteger(int n) {
        int temp=0;
        int temp1=0;
        while(n!=0){
            int d=n%10;
            temp+=d;
            temp1+=d*d;
            n/=10;
        }
        if(temp1-temp>=50) return true;
        return false;
    }
}