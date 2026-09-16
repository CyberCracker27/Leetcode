// Last updated: 9/16/2026, 6:55:49 AM
1class Solution {
2    public int[][] diagonalSort(int[][] mat) {
3        int m=mat.length,n=mat[0].length;
4        for(int i=0;i<m;i++){
5            List<Integer> li=new ArrayList<>();
6            int j=0,k=i;
7            li.add(mat[k][j]);
8            while(k+1<m && j+1<n){
9                li.add(mat[k+1][j+1]);
10                k++;
11                j++;
12            }
13            Collections.sort(li);
14            j=0;k=i;
15            mat[k][j]=li.get(j);
16            while(k+1<m && j+1<n){
17                mat[k+1][j+1]=li.get(j+1);
18                k++;
19                j++;
20            }
21        }
22        for(int i=0;i<n;i++){
23            List<Integer> li=new ArrayList<>();
24            int j=0,k=i;
25            li.add(mat[j][k]);
26            while(k+1<n && j+1<m){
27                li.add(mat[j+1][k+1]);
28                k++;
29                j++;
30            }
31            Collections.sort(li);
32            j=0;k=i;
33            mat[j][k]=li.get(j);
34            while(k+1<n && j+1<m){
35                mat[j+1][k+1]=li.get(j+1);
36                k++;
37                j++;
38            }
39        }
40        return mat;
41    }
42}