// Last updated: 07/02/2026, 20:31:53
1class Solution {
2    public boolean validPalindrome(String s) {
3        int left=0,right=s.length()-1;
4        while(left<right){
5            if(s.charAt(left) != s.charAt(right)){
6                return isPalindrome(s,left+1,right) || isPalindrome(s,left,right-1);
7            }
8            left++;
9            right--;
10        }
11        return true;
12    }
13    public boolean isPalindrome(String s,int left,int right){
14        while(left<right){
15            if(s.charAt(left) != s.charAt(right)) return false;
16            left++;
17            right--;
18        }
19        return true;
20    }
21}