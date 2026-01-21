// Last updated: 21/01/2026, 22:08:01
class Solution {
    public String reversePrefix(String s, int k) {
        String c="";
        for(int i=0;i<s.length();i++){
            if(i<k){
                c=String.valueOf(s.charAt(i))+c;
            }else{
                c=c+String.valueOf(s.charAt(i));
            }
        }
        return c;
    }
}