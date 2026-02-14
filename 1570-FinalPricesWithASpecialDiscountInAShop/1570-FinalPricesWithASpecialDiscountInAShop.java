// Last updated: 14/02/2026, 07:50:42
class Solution {
    public int[] finalPrices(int[] prices) {
        for(int i=0;i<prices.length;i++){
            int c=0;
            for(int j=i+1;j<prices.length;j++){
                if(prices[j]<=prices[i]){
                    c=prices[j];
                    break;
                }
            }
            prices[i]=prices[i]-c;
        }
        return prices;
    }
}