// Last updated: 7/13/2026, 8:52:26 PM
class Solution {
    public boolean isSubsequence(String s, String t) {
        int sp=0;
        int st=0;
        while(sp<s.length() && st<t.length()){
            if(s.charAt(sp)==t.charAt(st)){
                sp++;
            }
            st++;
        }
        return sp==s.length();
    }
}