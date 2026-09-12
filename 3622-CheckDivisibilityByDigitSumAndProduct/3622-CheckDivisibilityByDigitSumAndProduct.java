// Last updated: 9/12/2026, 7:19:30 AM
class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int product=1;
        int temp=n;
        while(temp!=0){
            int digit=temp%10;
            sum+=digit;
            product*=digit;
            temp/=10;
        }
        return n%(sum+product)==0;
    }
}