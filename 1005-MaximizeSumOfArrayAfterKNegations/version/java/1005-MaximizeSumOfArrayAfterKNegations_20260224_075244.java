// Last updated: 24/02/2026, 07:52:44
1class Solution {
2    public boolean uniqueOccurrences(int[] arr) {
3        HashMap<Integer,Integer> a=new HashMap<>();
4        for(int i=0;i<arr.length;i++){
5            a.put(arr[i],a.getOrDefault(arr[i],0)+1);
6        }
7        Set<Integer> s= new HashSet<>();
8        for(int x:a.values()){
9            s.add(x);
10        }
11        return a.size()==s.size();
12    }
13}