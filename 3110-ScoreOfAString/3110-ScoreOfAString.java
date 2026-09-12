// Last updated: 9/12/2026, 7:21:22 AM
class Solution {
    public int scoreOfString(String s) {
        int count=0;
        for(int i=1;i<s.length();i++){
            count+=Math.abs(Integer.valueOf(s.charAt(i-1))-Integer.valueOf(s.charAt(i)));
        }
        return count;
    }
}