// Last updated: 9/12/2026, 7:27:29 AM
class Solution {
    public int getLucky(String s, int k) {
        String c="";
        for(int i=0;i<s.length();i++){
            c=c+String.valueOf(s.charAt(i)-96);
        }
        int h=0;
        for(int i=1;i<=k;i++){
            int f=0;
            for(int j=0;j<c.length();j++){
                f+=Integer.parseInt(String.valueOf(c.charAt(j)));
            }
            c=String.valueOf(f);
            h=f;
        }
        return h;
    }
}