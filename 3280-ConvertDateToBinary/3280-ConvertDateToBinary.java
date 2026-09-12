// Last updated: 9/12/2026, 7:20:42 AM
class Solution {
    public String convertDateToBinary(String date) {
        String s="";
        String o="";
        for(int i=0;i<date.length();i++){
            if(date.charAt(i)!='-'){
                o+=date.charAt(i);
            }
            if(date.charAt(i)=='-' || i==date.length()-1){
                s+=Integer.toBinaryString(Integer.parseInt(o));
                if(i!=date.length()-1){
                    s+="-";
                }
                o="";
            }
        }
        return s;
    }
}