// Last updated: 9/12/2026, 7:28:17 AM
class Solution {
    public int sumBase(int n, int k) {
        int sum=0;
        while(n>0){
            sum+=n%k;
            n/=k;
        }
        return sum;
    }
}