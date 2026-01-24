// Last updated: 24/01/2026, 21:14:11
class Solution {
    public int vowelConsonantScore(String s) {
        int c=0,v=0;
        for(char a:s.toCharArray()){
            if("aeiou".contains(String.valueOf(a))){
                v++;
            }else if(Character.isLetter(a)){
                c++;
            }
        }
        if(c==0){
            return 0;
        }
        return (int)Math.floor(v/c);
    }
}