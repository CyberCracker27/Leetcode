// Last updated: 7/17/2026, 6:45:30 AM
class Solution {
    public int gcdOfOddEvenSums(int n) {
        int a=0,b=0;
        for(int i=1;i<=n*2;i++){
            if(i%2==0){
                b+=i;
            }else{
                a+=i;
            }
        }
        return gcd(a,b);
    }
    public int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
}