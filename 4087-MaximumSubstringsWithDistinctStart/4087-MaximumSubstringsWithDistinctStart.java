// Last updated: 8/3/2026, 9:24:02 AM
class Solution {
    public int maxDistinct(String s) {
        HashSet<Character> set =new HashSet<>();
        for(char ch:s.toCharArray()){
            set.add(ch);
        }
        return set.size();
    }
}