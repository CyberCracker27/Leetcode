// Last updated: 20/02/2026, 07:44:51
1class Solution {
2    public int findSpecialInteger(int[] arr) {
3        HashMap<Integer,Integer> a=new HashMap<>();
4        for(int ar:arr){
5            a.put(ar,a.getOrDefault(ar,0)+1);
6        }
7        int max=0;
8        int b=0;
9        for(int k:a.keySet()){
10            if(a.get(k)>max){
11                max=a.get(k);
12                b=k;
13            }
14        }
15        return b;
16    }
17}