// Last updated: 21/01/2026, 22:09:06
class Solution {
    public String reversePrefix(String word, char ch) {
        String s="";
        int a=word.indexOf(ch);
        for(int i=0;i<word.length();i++){
            if(i<=a){
                s=String.valueOf(word.charAt(i))+s;
            }else{
                s=s+String.valueOf(word.charAt(i));
            }
        }
        return s;
    }
}