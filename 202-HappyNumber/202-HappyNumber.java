// Last updated: 21/01/2026, 22:11:01
class Solution {
    public boolean isHappy(int n) {
        while(n>9){
            int temp=0;
            while(n!=0){
                int digit=n%10;
                temp=temp+(digit*digit);
                n/=10;
            }
            n=temp;
        }
        return n==1 ||n==7;
    }
}