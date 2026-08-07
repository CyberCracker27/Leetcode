// Last updated: 8/7/2026, 7:01:18 AM
class Solution {
    public int smallestNumber(int n, int t) {
        while(true){
            int temp=n;
            int c=1;
            while(temp!=0){
                c*=temp%10;
                temp/=10;
            }
            if(c%t==0){
                return n;
            }
            n++;
        }
    }
}