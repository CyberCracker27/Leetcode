// Last updated: 7/13/2026, 8:49:34 PM
class Solution {
    public int maxVowels(String s, int k) {
        int i=0,j=0;
        int max=0;
        int vowel=0;
        while(j<s.length()){
            if(isvowel(s.charAt(j))) vowel++;
            if(j-i+1==k){
                if(vowel>max){
                    max=vowel;
                }
                if(isvowel(s.charAt(i))) vowel--;
                i++;
            }
            j++;
        }
        return max;
    }
    public boolean isvowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}