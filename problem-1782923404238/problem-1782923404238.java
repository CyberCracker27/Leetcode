// Last updated: 7/1/2026, 10:00:04 PM
1class Solution {
2    public boolean isBalanced(String num) {
3        int odd=0,even=0;
4        for(int i=0;i<num.length();i++){
5            if(i%2==0){
6                even+=Integer.valueOf(String.valueOf(num.charAt(i)));
7            }else{
8                odd+=Integer.valueOf(String.valueOf(num.charAt(i)));
9            }
10        }
11        if(odd==even){
12            return true;
13        }else{
14            return false;
15        }
16    }
17}