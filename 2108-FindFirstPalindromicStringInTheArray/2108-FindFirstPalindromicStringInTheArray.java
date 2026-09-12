// Last updated: 9/12/2026, 7:25:57 AM
class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
            if(ispali(words[i])){
                return words[i];
            }
        }
        return "";
    }
    public boolean ispali(String word){
        int i=0,j=word.length()-1;
        while(i<j){
            if(word.charAt(i)!=word.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}