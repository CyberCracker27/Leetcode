// Last updated: 9/12/2026, 7:22:30 AM
class Solution {
    public int minimizedStringLength(String s) {
        HashSet<Character> a=new HashSet<>();
        for(char b:s.toCharArray()){
            a.add(b);
        }
        return a.size();
    }
}