// Last updated: 9/12/2026, 7:18:12 AM
class Solution {
    public int mirrorDistance(int n) {
        int rev=0;
        int temp=n;
        while(temp>0){
            rev=(rev*10)+(temp%10);
            temp/=10;
        }
        return Math.abs(rev-n);
    }
}