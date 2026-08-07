// Last updated: 8/7/2026, 7:01:47 AM
class Solution {
    public int buyChoco(int[] prices, int money) {
        int rem=money;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                int c=prices[i]+prices[j];
                if(c<=money){
                    if(c<min){
                        min=c;
                        rem=money-c;
                    }
                }
            }
        }
        return rem;
    }
}