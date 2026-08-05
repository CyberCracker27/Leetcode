// Last updated: 8/5/2026, 6:52:01 AM
class Solution {
    public boolean isPrefixString(String s, String[] words) {
        StringBuilder res=new StringBuilder("");
        for(String word:words){
            res.append(word);
            if(s.equals(res.toString())){
                return true;
            }
            if(s.indexOf(res.toString())==-1){
                return false;
            }
        }
        return false;
    }
}