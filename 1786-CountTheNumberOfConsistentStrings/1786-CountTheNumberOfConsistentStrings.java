// Last updated: 10/02/2026, 08:03:40
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