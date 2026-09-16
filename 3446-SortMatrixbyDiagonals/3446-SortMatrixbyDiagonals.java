// Last updated: 9/16/2026, 7:02:24 AM
1class Solution {
2    public int[][] sortMatrix(int[][] mat) {
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
14            int a=li.size()-1;
15            j=0;k=i;
16            mat[k][j]=li.get(a--);
17            while(k+1<m && j+1<n){
18                mat[k+1][j+1]=li.get(a--);
19                k++;
20                j++;
21            }
22        }
23        for(int i=1;i<n;i++){
24            List<Integer> li=new ArrayList<>();
25            int j=0,k=i;
26            li.add(mat[j][k]);
27            while(k+1<n && j+1<m){
28                li.add(mat[j+1][k+1]);
29                k++;
30                j++;
31            }
32            Collections.sort(li);
33            j=0;k=i;
34            mat[j][k]=li.get(j);
35            while(k+1<n && j+1<m){
36                mat[j+1][k+1]=li.get(j+1);
37                k++;
38                j++;
39            }
40        }
41        return mat;
42    }
43}