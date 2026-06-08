// Last updated: 6/8/2026, 8:48:34 PM
class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length()<26) return false;
        for(char i='a';i<='z';i++){
            if(sentence.indexOf(i)<0){
                return false;
            }
        }
        return true;
    }
}