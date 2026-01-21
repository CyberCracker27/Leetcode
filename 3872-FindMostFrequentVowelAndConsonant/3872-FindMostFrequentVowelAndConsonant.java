// Last updated: 21/01/2026, 22:08:10
class Solution {
    public int maxFreqSum(String s) {
        int vo=0;
        int cons=0;
        for(int i=0;i<s.length();i++){
            if(cons==0 && !"aeiou".contains(String.valueOf(s.charAt(i)))){
                cons=1;
            }
            if("aeiou".contains(String.valueOf(s.charAt(i))) && vo==0){
                vo=1;
            }
         int c=1;
         for(int j=i+1;j<s.length();j++){
            if(s.charAt(i)==s.charAt(j)){
               c++;
               if("aeiou".contains(String.valueOf(s.charAt(i)))){
                  if(c>vo){
                     vo=c;
                  }
               }else{
                  if(c>cons){
                     cons=c;
                  }
               }
            }
         }
        }
        return vo+cons;
    }
}