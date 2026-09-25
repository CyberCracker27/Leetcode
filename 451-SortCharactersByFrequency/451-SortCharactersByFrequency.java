// Last updated: 9/25/2026, 7:09:18 AM
1class Solution {
2    public String frequencySort(String s) {
3        HashMap<Character,Integer> map=new HashMap<>();
4        int max=0;
5        for(char c:s.toCharArray()){
6            map.put(c,map.getOrDefault(c,0)+1);
7            if(map.get(c)>max){
8                max=map.get(c);
9            }
10        }
11        StringBuilder sb=new StringBuilder();
12        while(sb.length()<s.length()){
13            for(char c:map.keySet()){
14                if(map.get(c)==max){
15                    for(int i=0;i<max;i++){
16                        sb.append(c);
17                    }
18                }
19            }
20            max--;
21        }
22        return sb.toString();
23    }
24}