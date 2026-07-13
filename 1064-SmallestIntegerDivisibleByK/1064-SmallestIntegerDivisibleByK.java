// Last updated: 7/13/2026, 8:50:51 PM
class Solution {
    public int smallestRepunitDivByK(int k) {
        int rem=0;
        for(int i=1;i<=k;i++){
            rem=(rem*10+1)%k;
            if(rem==0) return i;
        }
        return -1;
    }
}