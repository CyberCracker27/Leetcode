// Last updated: 10/04/2026, 07:02:15
class Solution {
    public int minimizedStringLength(String s) {
        HashSet<Character> a=new HashSet<>();
        for(char b:s.toCharArray()){
            a.add(b);
        }
        return a.size();
    }
}