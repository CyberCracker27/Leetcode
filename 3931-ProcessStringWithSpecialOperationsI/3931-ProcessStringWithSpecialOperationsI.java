// Last updated: 7/13/2026, 8:46:22 PM
class Solution {
    public String processStr(String s) {
        StringBuilder sl=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='*'){
                if(sl.length()>0){
                    sl.deleteCharAt(sl.length() - 1);
                }
            }else if(s.charAt(i)=='#'){
                sl.append(sl);
            }else if(s.charAt(i)=='%'){
                sl.reverse();
            }else{
                sl.append(s.charAt(i));
            }
        }
        return sl.toString();
    }
}