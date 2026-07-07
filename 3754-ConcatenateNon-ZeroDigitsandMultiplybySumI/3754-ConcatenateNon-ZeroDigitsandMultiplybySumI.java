// Last updated: 7/7/2026, 6:49:41 AM
1class Solution {
2    public long sumAndMultiply(int n) {
3        long c=0;
4        String s="";
5        long sum=0;
6        while(n!=0){
7            int digit=n%10;
8            sum+=digit;
9            if(digit!=0)
10            s=digit+s;
11            n/=10;
12        }
13        if(s.equals("")){
14            return 0;
15        }
16        c=Long.parseLong(s)*sum;
17        return c;
18    }
19}