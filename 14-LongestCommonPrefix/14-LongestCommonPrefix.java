// Last updated: 21/01/2026, 22:11:29
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String c="";
        String d="";
        for(int i=0;i<strs[0].length();i++){
            c=String.valueOf(strs[0].charAt(i));
            boolean a=true;
            int j;
            for(j=1;j<strs.length;j++){
                if(strs[j].length()-1>=i){
                    if(!(c.equals(String.valueOf(strs[j].charAt(i))))){
                        a=false;
                        break;
                    }
                }else{
                    a=false;
                    break;
                }
            }
            if(a==true){
                d=d+c;
            }else{
                break;
            }
        }
        return d;
    }
}