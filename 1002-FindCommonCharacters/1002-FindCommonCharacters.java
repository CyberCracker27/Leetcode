// Last updated: 8/19/2026, 6:47:00 AM
1class Solution {
2    public int numberOfChild(int n, int k) {
3        n--;
4        int ron=k/n;
5        int rem=k%n;
6        if(ron%2==0){
7            return rem;
8        }else{
9            return n-rem;
10        }
11    }
12}