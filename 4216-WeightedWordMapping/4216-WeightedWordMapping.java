// Last updated: 7/13/2026, 8:45:50 PM
class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<26;i++){
            char a=(char)(97+i);
            map.put(a,weights[i]);
            System.out.print(a);
        }
        String fin="";
        for(String s:words){
            int co=0;
            for(char c:s.toCharArray()){
                if(map.containsKey(c)){
                    co+=map.get(c);
                }
            }
            
            co%=26;
            char f=(char)(97+(25-co));
            fin=fin+f;
        }
        return fin;
    }
}