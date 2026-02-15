// Last updated: 15/02/2026, 08:34:04
1class Solution {
2    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
3        List<Integer> a=new ArrayList<>();
4        for(Integer b:bulbs){
5            boolean c=a.remove(b);
6            if(!c){
7                a.add(b);
8            }
9        }
10        Collections.sort(a);
11        return a;
12    }
13}