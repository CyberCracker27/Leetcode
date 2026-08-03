// Last updated: 8/3/2026, 9:27:48 AM
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