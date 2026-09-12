// Last updated: 9/12/2026, 7:23:20 AM
class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int c=0;
        for(int i=left;i<=right;i++){
            if("aeiou".contains(String.valueOf(words[i].charAt(0))) && "aeiou".contains(String.valueOf(words[i].charAt(words[i].length()-1))) ){
                c++;
            }
        }
        return c;
    }
}