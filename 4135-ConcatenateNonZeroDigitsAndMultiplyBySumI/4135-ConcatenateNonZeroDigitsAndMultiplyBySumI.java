// Last updated: 21/01/2026, 22:08:05
class Solution {
    public long sumAndMultiply(int n) {
        long non=0;
        long sum=0;
        int c=1;
        while(n!=0){
            int digit=n%10;
            if(digit!=0){
                sum+=digit;
                non=(digit*c)+non;
                c*=10;
            }
            n/=10;
        }
        return non*sum;
    }
}