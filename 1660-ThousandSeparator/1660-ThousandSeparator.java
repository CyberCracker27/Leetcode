// Last updated: 21/01/2026, 22:09:19
class Solution {
    public String thousandSeparator(int n) {
        String s=String.valueOf(n);
        String c="";
        for(int i=s.length()-1;i>=0;i--){
            if(s.length()-1-i<3){
                c=String.valueOf(s.charAt(i))+c;
            }
            else if((s.length()-1-i)%3==0){
                c="."+c;
                c=String.valueOf(s.charAt(i))+c;
            }else{
                c=String.valueOf(s.charAt(i))+c;
            }
        }
        return c;
    }
}