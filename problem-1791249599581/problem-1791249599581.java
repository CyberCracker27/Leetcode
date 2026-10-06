// Last updated: 10/6/2026, 6:49:59 AM
1class Solution {
2    public String[] uncommonFromSentences(String s1, String s2) {
3        HashMap<String,Integer> s=new HashMap<>();
4        for(String sq:s1.split(" ")){
5            s.put(sq,s.getOrDefault(sq,0)+1);
6        }
7        for(String sq:s2.split(" ")){
8           s.put(sq,s.getOrDefault(sq,0)+1);
9        }
10        int i=0;
11        List<String> a=new ArrayList<>();
12        for(String sq:s.keySet()){
13            if(s.get(sq)==1){
14                a.add(sq);
15            }
16        }
17        String sw[]=new String[a.size()];
18        for(String sq:a){
19            sw[i++]=sq;
20        }
21        return sw;
22    }
23}