// Last updated: 6/13/2026, 10:54:53 AM
1class Solution {
2    public String mapWordWeights(String[] words, int[] weights) {
3        HashMap<Character,Integer> map=new HashMap<>();
4        for(int i=0;i<26;i++){
5            char a=(char)(97+i);
6            map.put(a,weights[i]);
7            System.out.print(a);
8        }
9        String fin="";
10        for(String s:words){
11            int co=0;
12            for(char c:s.toCharArray()){
13                if(map.containsKey(c)){
14                    co+=map.get(c);
15                }
16            }
17            
18            co%=26;
19            char f=(char)(97+(25-co));
20            fin=fin+f;
21        }
22        return fin;
23    }
24}