// Last updated: 01/03/2026, 08:46:54
1class Solution {
2    public String trimTrailingVowels(String s) {
3        int i=s.length()-1;
4        while(i>=0 && isVowel(s.charAt(i))){
5            i--;
6        }
7        return s.substring(0,i+1);
8    }
9    public boolean isVowel(char a){
10        return a=='a'||a=='e'||a=='i'||a=='o'||a=='u';
11    }
12}