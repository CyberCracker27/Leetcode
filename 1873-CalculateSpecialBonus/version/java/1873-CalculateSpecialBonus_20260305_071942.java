// Last updated: 05/03/2026, 07:19:42
1class Solution {
2    public boolean checkZeroOnes(String s) {
3        int maxo=0;
4        int maxz=0;
5        int counto=0;
6        int countz=0;
7        for(char a:s.toCharArray()){
8            if(a=='0'){
9                countz++;
10                counto=0;
11                if(maxz<countz){
12                    maxz=countz;
13                }
14            }
15            else{
16                counto++;
17                countz=0;
18                if(maxo<counto){
19                    maxo=counto;
20                }
21            }
22        }
23        return maxo>maxz;
24    }
25}