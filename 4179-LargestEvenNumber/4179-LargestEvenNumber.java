// Last updated: 21/01/2026, 22:07:56
class Solution {
    public String largestEven(String s) {
        int i = 0;
        for (i = s.length() - 1; i >= 0; i--) {
            if(s.charAt(i)=='2') break;
        }
        return s.substring(0,i+1);
    }
}