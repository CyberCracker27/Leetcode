// Last updated: 9/12/2026, 7:34:28 AM
class Solution {
    public int[] finalPrices(int[] prices) {
        int arr[]=new int[prices.length];
        for(int i=0;i<prices.length;i++){
            int a=0;
            for(int j=i+1;j<prices.length;j++){
                if(prices[j]<=prices[i]){
                    a=prices[j];
                    break;
                }
            }
            arr[i]=prices[i]-a;
        }
        return arr;
    }
}