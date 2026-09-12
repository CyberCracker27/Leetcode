// Last updated: 9/12/2026, 7:27:53 AM
class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder str=new StringBuilder(s);
        while(s.contains(part)){
            s=s.replaceFirst(part,"");
        }
        return s;
    }
}