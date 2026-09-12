// Last updated: 9/12/2026, 7:31:43 AM
class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int c=0;
        for(int i=0;i<words.length;i++){
            boolean a=true;
            for(int j=0;j<words[i].length();j++){
                if(!allowed.contains(String.valueOf(words[i].charAt(j)))){
                    a=false;
                    break;
                }
            }
            if(a){
                c++;
            }
        }
        return c;
    }
}