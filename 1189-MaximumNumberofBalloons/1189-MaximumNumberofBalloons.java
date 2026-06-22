// Last updated: 6/22/2026, 6:46:42 AM
1class Solution {
2    public int maxIceCream(int[] costs, int coins) {
3        int i=0;
4        int c=0;
5        Arrays.sort(costs);
6        for(int j=0;j<costs.length;j++){
7            if(i+costs[j]>coins){
8                continue;
9            }else{
10                i+=costs[j];
11                c++;
12            }
13
14        }
15        return c;
16    }
17}