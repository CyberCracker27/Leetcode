// Last updated: 9/12/2026, 7:19:05 AM
class Solution {
    public long removeZeros(long n) {
        String s="";
        while(n!=0){
            long a=n%10;
            if(a!=0){
                s=String.valueOf(a)+s;
            }
            n/=10;
        }
        return Long.parseLong(s);
    }
}