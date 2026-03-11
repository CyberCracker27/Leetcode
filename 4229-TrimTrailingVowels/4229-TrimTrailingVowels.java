// Last updated: 11/03/2026, 07:19:04
class Solution {
    public String trimTrailingVowels(String s) {
        int i=s.length()-1;
        while(i>=0 && isVowel(s.charAt(i))){
            i--;
        }
        return s.substring(0,i+1);
    }
    public boolean isVowel(char a){
        return a=='a'||a=='e'||a=='i'||a=='o'||a=='u';
    }
}