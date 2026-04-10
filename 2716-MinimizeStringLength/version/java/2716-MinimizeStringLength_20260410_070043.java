// Last updated: 10/04/2026, 07:00:43
1class Solution {
2    public int minimizedStringLength(String s) {
3        HashSet<Character> a=new HashSet<>();
4        for(char b:s.toCharArray()){
5            a.add(b);
6        }
7        return a.size();
8    }
9}