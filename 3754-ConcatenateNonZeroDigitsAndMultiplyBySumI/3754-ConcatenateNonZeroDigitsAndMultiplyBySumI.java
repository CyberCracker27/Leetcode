// Last updated: 9/12/2026, 7:18:21 AM
class Solution {
    public long sumAndMultiply(int n) {
        long c=0;
        String s="";
        long sum=0;
        while(n!=0){
            int digit=n%10;
            sum+=digit;
            if(digit!=0)
            s=digit+s;
            n/=10;
        }
        if(s.equals("")){
            return 0;
        }
        c=Long.parseLong(s)*sum;
        return c;
    }
}