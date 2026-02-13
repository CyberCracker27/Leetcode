// Last updated: 13/02/2026, 07:47:00
1class Solution {
2    public int[] finalPrices(int[] prices) {
3        for(int i=0;i<prices.length;i++){
4            int c=0;
5            for(int j=i+1;j<prices.length;j++){
6                if(prices[j]<=prices[i]){
7                    c=prices[j];
8                    break;
9                }
10            }
11            prices[i]=prices[i]-c;
12        }
13        return prices;
14    }
15}