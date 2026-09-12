// Last updated: 9/12/2026, 7:37:34 AM
class Solution {
    public int tribonacci(int n) {
        if(n==0) return 0;
        if(n==1) return 1;
        if(n==2) return 1;
        int a=0;
        int b=1;
        int c=1;
        for(int i=3;i<=n;i++){
            int  res=a+b+c;
            a=b;
            b=c;
            c=res;
        }
        return c;
    }
}