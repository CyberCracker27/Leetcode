// Last updated: 21/01/2026, 22:11:18
class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim().replaceAll("\\s+"," ");
        int e=1;
        int d=s.length();
        char c=s.charAt(d-1);
        while(c!=' ' && d>=e){
            e++;
            if(d>=e){
            c=s.charAt(d-e);}
        }
        return e-1;
    }
}