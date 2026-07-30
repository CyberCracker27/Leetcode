// Last updated: 7/30/2026, 6:48:51 AM
1class Solution {
2    public int maxDistinct(String s) {
3        HashSet<Character> set =new HashSet<>();
4        for(char ch:s.toCharArray()){
5            set.add(ch);
6        }
7        return set.size();
8    }
9}