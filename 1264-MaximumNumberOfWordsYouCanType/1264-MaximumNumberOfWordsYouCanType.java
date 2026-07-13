// Last updated: 7/13/2026, 8:50:07 PM
class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] arr=text.split(" ");
        int c=0;
        for(String s:arr){
            boolean a=true;
            for(char i:brokenLetters.toCharArray()){
                if(s.contains(String.valueOf(i))){
                    a=false;
                    break;
                }
            }
            if(a){
                c++;
            }
        }
        return c;
    }
}