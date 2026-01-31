// Last updated: 31/01/2026, 07:57:40
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