// Last updated: 7/3/2026, 4:19:48 PM
1class Solution {
2    public boolean checkPowersOfThree(int n) {
3        while(n>0){
4            if(n%3==2){
5                return false;
6            }
7            n/=3;
8        }
9        return true;
10    }
11}