// Last updated: 21/01/2026, 22:11:14
class Solution {
    public int maxProfit(int[] prices) {
        int c=0;
        int a=prices[0];
        for(int i=0;i<prices.length;i++){
            if(prices[i]<a){
                a=prices[i];
            }else if(prices[i]-a>c){
                c=prices[i]-a;
            }
        }
        return c;
    }
}