// Last updated: 9/12/2026, 7:17:59 AM
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