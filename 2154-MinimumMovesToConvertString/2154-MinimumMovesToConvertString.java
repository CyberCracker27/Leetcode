// Last updated: 11/03/2026, 07:19:37
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