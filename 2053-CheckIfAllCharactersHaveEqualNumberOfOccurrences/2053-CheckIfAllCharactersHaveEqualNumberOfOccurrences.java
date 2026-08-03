// Last updated: 8/3/2026, 9:27:36 AM
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