// Last updated: 7/10/2026, 9:04:24 AM
1class Solution {
2    public boolean completePrime(int num) {
3        if(num<10) return isprime(num);
4        String s=String.valueOf(num);
5        for(int i=0;i<s.length();i++){
6            String su=s.substring(0,i+1);
7            int pre=Integer.parseInt(su);
8            if(!isprime(pre)){
9                return false;
10            }
11        }
12        for(int i=0;i<s.length();i++){
13            String su=s.substring(i,s.length());
14            int pre=Integer.parseInt(su);
15            if(!isprime(pre)){
16                return false;
17            }
18        }
19        return true;
20    }
21    public boolean isprime(int n){
22        if(n<=1) return false;
23        for(int i=2;i*i<=n;i++){
24            if(n%i==0){
25                return false;
26            }
27        }
28        return true;
29    }
30}