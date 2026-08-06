// Last updated: 8/6/2026, 10:39:59 PM
1class Solution {
2    public int smallestNumber(int n, int t) {
3        while(true){
4            int temp=n;
5            int c=1;
6            while(temp!=0){
7                c*=temp%10;
8                temp/=10;
9            }
10            if(c%t==0){
11                return n;
12            }
13            n++;
14        }
15    }
16}