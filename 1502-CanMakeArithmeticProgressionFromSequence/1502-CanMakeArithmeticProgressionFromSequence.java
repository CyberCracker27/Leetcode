// Last updated: 6/9/2026, 9:41:29 AM
1class Solution {
2    public boolean isPalindrome(int x) {
3        if(x<0){
4            return false;
5        }
6        int rev=0;
7        int temp=x;
8        while(temp!=0){
9            rev=(rev*10)+temp%10;
10            temp/=10;
11        }
12        return (x==rev)?true:false;
13    }
14}