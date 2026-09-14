// Last updated: 9/14/2026, 9:18:07 AM
1class Solution {
2    public int[] kWeakestRows(int[][] mat, int k) {
3        HashMap<Integer,Integer> map=new HashMap<>();
4        for(int i=0;i<mat.length;i++){
5            int c=0;
6            for(int j=0;j<mat[i].length;j++){
7                if(mat[i][j]==1){
8                    c++;
9                }
10            }
11            map.put(i,c);
12        }
13        Integer row[]=new Integer[mat.length];
14        for(int i=0;i<mat.length;i++){
15            row[i]=i;
16        }
17        Arrays.sort(row,(a,b)->{
18            if(map.get(a)!=map.get(b)){
19                return map.get(a)-map.get(b);
20            }
21            return a-b;
22        });
23        int rec[]=new int[k];
24        for(int i=0;i<k;i++){
25            rec[i]=row[i];
26        }
27        return rec;
28    }
29}