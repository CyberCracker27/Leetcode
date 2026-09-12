// Last updated: 9/12/2026, 7:17:38 AM
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