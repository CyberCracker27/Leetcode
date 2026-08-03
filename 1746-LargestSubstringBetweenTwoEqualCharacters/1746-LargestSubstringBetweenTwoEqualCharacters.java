// Last updated: 8/3/2026, 9:28:37 AM
class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int max=-1;
        for(int i=0;i<s.length();i++){
            int c=0;
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    max=Math.max(max,c);
                }
                c++;
            }
        }
        return max;
    }
}