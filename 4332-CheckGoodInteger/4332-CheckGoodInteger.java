// Last updated: 7/13/2026, 8:45:26 PM
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