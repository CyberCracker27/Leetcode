// Last updated: 9/12/2026, 7:26:22 AM
class Solution {
    public int minimumMoves(String s) {
        int i=0;
        int min=0;
        while(i<s.length()){
            char ch=s.charAt(i);
            if(ch=='X'){
                min++;
                i+=3;
            }else{
                i++;
            }
        }
        return min;
    }
}