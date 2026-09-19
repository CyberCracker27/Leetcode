// Last updated: 9/19/2026, 7:18:47 AM
1class Solution {
2    public int numSpecial(int[][] mat) {
3        int c=0;
4        for(int i=0;i<mat.length;i++){
5            boolean a=true;
6            boolean f=false;
7            for(int j=0;j<mat[0].length;j++){
8                if(mat[i][j]==1){
9                    f=true;
10                    int l=i-1,m=j;
11                    while(l>=0){
12                        if(mat[l][m]==1){
13                            a=false;
14                        }
15                        l--;
16                    }
17                    l=i+1;
18                    while(l<mat.length){
19                        if(mat[l][m]==1){
20                            a=false;
21                        }
22                        l++;
23                    }
24                    l=i;
25                    m=j-1;
26                    while(m>=0){
27                        if(mat[l][m]==1){
28                            a=false;
29                        }
30                        m--;
31                    }
32                    m=j+1;
33                    while(m<mat[0].length){
34                        if(mat[l][m]==1){
35                            a=false;
36                        }
37                        m++;
38                    }
39                }
40            }
41            if(a&&f){
42                c++;
43            }
44        }
45        return c;
46    }
47}