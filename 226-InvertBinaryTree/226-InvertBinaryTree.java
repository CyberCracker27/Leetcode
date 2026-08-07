// Last updated: 8/7/2026, 6:59:39 AM
1class Solution {
2    public int buyChoco(int[] prices, int money) {
3        int rem=money;
4        int min=Integer.MAX_VALUE;
5        for(int i=0;i<prices.length;i++){
6            for(int j=i+1;j<prices.length;j++){
7                int c=prices[i]+prices[j];
8                if(c<=money){
9                    if(c<min){
10                        min=c;
11                        rem=money-c;
12                    }
13                }
14            }
15        }
16        return rem;
17    }
18}