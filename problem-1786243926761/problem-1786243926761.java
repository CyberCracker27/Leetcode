// Last updated: 8/9/2026, 8:22:06 AM
1class Solution {
2    public double minPrice(int[] prices, int[] discounts) {
3        Arrays.sort(prices);
4        Arrays.sort(discounts);
5        int i=prices.length-1;
6        int j=discounts.length-1;
7        double c=0;
8        while(i>=0 && j>=0){
9            c+=prices[i--]*(100-discounts[j--])/100.0;
10        }
11        while(i>=0){
12            c+=prices[i--];
13        }
14        return c;
15    }
16}