// Last updated: 28/01/2026, 08:10:15
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String word3="";
        String word4="";
        for(int i=0;i<word1.length;i++){
            word3=word3+word1[i];
        }
        for(int j=0;j<word2.length;j++){
            word4=word4+word2[j];
        }
        if(word3.equals(word4)){
            return true;
        }else{
            return false;
        }
    }
}