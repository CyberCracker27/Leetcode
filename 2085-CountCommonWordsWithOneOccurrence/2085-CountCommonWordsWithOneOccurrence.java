// Last updated: 10/6/2026, 6:58:05 AM
1class Solution {
2    public int countWords(String[] words1, String[] words2) {
3        HashMap<String,Integer> map1=new HashMap<>();
4        HashMap<String,Integer> map2=new HashMap<>();
5        for(String s:words1){
6            map1.put(s,map1.getOrDefault(s,0)+1);
7        }
8        for(String s:words2){
9            map2.put(s,map2.getOrDefault(s,0)+1);
10        }
11        int c=0;
12        for(String s:map1.keySet()){
13            if(map1.get(s)==1){
14                if(map2.containsKey(s) && map2.get(s)==1){
15                    c++;
16                }
17            }
18        }
19        return c;
20    }
21}