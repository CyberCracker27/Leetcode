// Last updated: 8/3/2026, 9:28:07 AM
class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder s=new StringBuilder();
        int a=Math.min(word1.length(),word2.length());
        int i=0,j=0;
        while(i<a&&j<a){
            s.append(word1.charAt(i++));
            s.append(word2.charAt(j++));
        }
        while(i<word1.length()){
            s.append(word1.charAt(i++));
        }
        while(j<word2.length()){
            s.append(word2.charAt(j++));
        }
        return s.toString();
    }
}