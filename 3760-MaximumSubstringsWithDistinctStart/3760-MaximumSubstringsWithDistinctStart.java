// Last updated: 9/12/2026, 7:18:41 AM
class Solution {
    public int maxDistinct(String s) {
        HashSet<Character> set =new HashSet<>();
        for(char ch:s.toCharArray()){
            set.add(ch);
        }
        return set.size();
    }
}