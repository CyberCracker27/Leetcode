// Last updated: 8/8/2026, 6:48:28 AM
1class Solution {
2    public int[] findThePrefixCommonArray(int[] A, int[] B) {
3        HashMap<Integer,Integer> map=new HashMap<>();
4        int n=A.length;
5        int count=0;
6        for(int i=0;i<n;i++){
7            map.put(A[i],map.getOrDefault(A[i],0)+1);
8            map.put(B[i],map.getOrDefault(B[i],0)+1);
9            if(map.get(A[i])==2){
10                count++;
11            }
12            if(A[i]!=B[i] && map.get(B[i])==2){
13                count++;
14            }
15            A[i]=count;
16        }
17        return A;
18    }
19}