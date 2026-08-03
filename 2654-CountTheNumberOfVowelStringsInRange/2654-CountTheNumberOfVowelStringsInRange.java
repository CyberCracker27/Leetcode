// Last updated: 8/3/2026, 9:25:56 AM
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