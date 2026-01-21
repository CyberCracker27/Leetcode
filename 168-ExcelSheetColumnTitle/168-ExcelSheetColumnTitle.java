// Last updated: 21/01/2026, 22:11:07
class Solution {
    public String convertToTitle(int c) {
        String s="";
        while(c>26){
            c--;
            int d=c%26;
            s=String.valueOf((char)(65+d))+s;
            c/=26;
        }
        s=String.valueOf((char)(65+c-1))+s;
        return s;
    }
}