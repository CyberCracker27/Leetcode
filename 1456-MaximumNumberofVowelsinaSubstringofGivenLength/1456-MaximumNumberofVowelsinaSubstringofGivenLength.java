// Last updated: 6/25/2026, 7:07:01 AM
1class Solution {
2    public int maxVowels(String s, int k) {
3        int i=0,j=0;
4        int max=0;
5        int vowel=0;
6        while(j<s.length()){
7            if(isvowel(s.charAt(j))) vowel++;
8            if(j-i+1==k){
9                if(vowel>max){
10                    max=vowel;
11                }
12                if(isvowel(s.charAt(i))) vowel--;
13                i++;
14            }
15            j++;
16        }
17        return max;
18    }
19    public boolean isvowel(char c){
20        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
21    }
22}