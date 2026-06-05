// Last updated: 6/5/2026, 12:09:03 PM
class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder str=new StringBuilder(s);
        while(s.contains(part)){
            s=s.replaceFirst(part,"");
        }
        return s;
    }
}