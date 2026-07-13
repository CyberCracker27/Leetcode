// Last updated: 7/13/2026, 8:48:49 PM
class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int c=0;
        for(String s:patterns){
            if(word.contains(s)){
                c++;
            }
        }
        return c;
    }
}