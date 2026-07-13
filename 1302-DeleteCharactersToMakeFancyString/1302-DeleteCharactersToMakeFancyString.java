// Last updated: 7/13/2026, 8:50:05 PM
class Solution {
    public String makeFancyString(String s) {
        int c=1;
        StringBuilder sl=new StringBuilder();
        sl.append(s.charAt(0));
        char f=s.charAt(0);
        for(int i=1;i<s.length();i++){
            if(f==s.charAt(i)){
                c++;
            }else{
                f=s.charAt(i);
                c=1;
            }
            if(c<3){
                sl.append(s.charAt(i));
            }
        }
        return sl.toString();
    }
}