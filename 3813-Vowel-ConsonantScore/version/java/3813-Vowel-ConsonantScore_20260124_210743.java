// Last updated: 24/01/2026, 21:07:43
1class Solution {
2    public int vowelConsonantScore(String s) {
3        int c=0,v=0;
4        for(char a:s.toCharArray()){
5            if("aeiou".contains(String.valueOf(a))){
6                v++;
7            }else if(Character.isLetter(a)){
8                c++;
9            }
10        }
11        if(c==0){
12            return 0;
13        }
14        return (int)Math.floor(v/c);
15    }
16}