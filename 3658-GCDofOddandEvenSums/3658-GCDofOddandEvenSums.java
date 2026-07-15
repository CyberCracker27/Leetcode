// Last updated: 7/15/2026, 6:50:40 AM
1class Solution {
2    public int gcdOfOddEvenSums(int n) {
3        int a=0,b=0;
4        for(int i=1;i<=n*2;i++){
5            if(i%2==0){
6                b+=i;
7            }else{
8                a+=i;
9            }
10        }
11        return gcd(a,b);
12    }
13    public int gcd(int a,int b){
14        if(b==0){
15            return a;
16        }
17        return gcd(b,a%b);
18    }
19}