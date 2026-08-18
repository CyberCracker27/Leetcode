// Last updated: 8/18/2026, 6:49:16 AM
class Solution {
    public int possibleStringCount(String word) {
        int n=word.length();
        int count=n;
        for(int i=1;i<n;i++){
            if(word.charAt(i)!=word.charAt(i-1)){
                count--;
            }
        }
        return count;
    }
}