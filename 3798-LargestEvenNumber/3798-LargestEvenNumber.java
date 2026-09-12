// Last updated: 9/12/2026, 7:17:55 AM
class Solution {
    public String largestEven(String s) {
        int i = 0;
        for (i = s.length() - 1; i >= 0; i--) {
            if(s.charAt(i)=='2') break;
        }
        return s.substring(0,i+1);
    }
}