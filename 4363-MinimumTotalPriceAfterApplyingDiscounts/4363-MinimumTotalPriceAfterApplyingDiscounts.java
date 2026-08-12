// Last updated: 8/12/2026, 6:57:39 AM
class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);
        int i=prices.length-1;
        int j=discounts.length-1;
        double c=0;
        while(i>=0 && j>=0){
            c+=prices[i--]*(100-discounts[j--])/100.0;
        }
        while(i>=0){
            c+=prices[i--];
        }
        return c;
    }
}