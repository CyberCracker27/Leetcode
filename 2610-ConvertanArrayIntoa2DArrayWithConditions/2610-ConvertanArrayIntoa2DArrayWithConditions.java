// Last updated: 8/11/2026, 7:03:02 AM
1class Solution {
2    public List<List<Integer>> findMatrix(int[] nums) {
3        HashMap<Integer,Integer> map=new HashMap<>();
4        List<List<Integer>> lio=new ArrayList<>();
5        for(int x:nums){
6            map.put(x,map.getOrDefault(x,0)+1);
7        }
8        while(!map.isEmpty()){
9            List<Integer> li=new ArrayList<>();
10            for(int x:new ArrayList<>(map.keySet())){
11                if(map.get(x)==1){
12                    li.add(x);
13                    map.remove(x);
14                }
15                else{
16                    map.put(x,map.get(x)-1);
17                    li.add(x);
18                }
19            }
20            lio.add(li);
21        }
22        return lio;
23    }
24}