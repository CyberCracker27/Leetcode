// Last updated: 9/12/2026, 7:27:50 AM
class Solution {
    public String largestOddNumber(String num) {
        String s="";
        int i=num.length()-1;
        while(i>=0){
            int c=Integer.parseInt(String.valueOf(num.charAt(i)));
            if(c%2!=0){
                s=num.substring(0,i+1);
                break;
            }
            i--;
        }
        return s;
    }
}