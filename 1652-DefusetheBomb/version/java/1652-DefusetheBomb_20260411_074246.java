// Last updated: 11/04/2026, 07:42:46
1class Solution {
2    public int[] decrypt(int[] code, int k) {
3        int[] a=new int[code.length];
4        if(k>0){
5            for(int i=0;i<code.length;i++){
6                int j=1;
7                int c=0;
8                while(j<=k){
9                    c+=code[(i+j)%code.length];
10                    j++;
11                }
12                a[i]=c;
13            }
14        }
15        if(k<0){
16             for(int i=0;i<code.length;i++){
17                int j=-1;
18                int c=0;
19                while(j>=k){
20                    c+=code[Math.abs(i+j+code.length)%code.length];
21                    j--;
22                }
23                a[i]=c;
24            }
25        }
26        return a;
27    }
28}