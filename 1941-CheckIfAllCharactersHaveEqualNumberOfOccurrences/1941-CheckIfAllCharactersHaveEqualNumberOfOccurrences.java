// Last updated: 9/12/2026, 7:27:42 AM
class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char a:s.toCharArray()){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        int freq=-1;
        for(int x:map.values()){
            if(freq==-1){
                freq=x;
            }
            else if(freq!=x){
                return false;
            }
        }
        return true;
    }
}