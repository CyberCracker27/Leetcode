// Last updated: 10/10/2026, 6:56:03 AM
1class Solution {
2    public String greatestLetter(String s) {
3        Set<Character> set=new HashSet<>();
4        for(char ch:s.toCharArray()){
5            set.add(ch);
6        }
7        for(char ch='Z';ch>='A';ch--){
8            if(set.contains(ch) && set.contains(Character.toLowerCase(ch))){
9                return ""+ch;
10            }
11        }
12        return "";
13    }
14}