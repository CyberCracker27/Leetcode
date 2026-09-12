// Last updated: 9/12/2026, 7:18:07 AM
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