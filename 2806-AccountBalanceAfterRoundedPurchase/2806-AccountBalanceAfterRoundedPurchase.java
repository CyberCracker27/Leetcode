// Last updated: 9/12/2026, 7:22:06 AM
class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        if(purchaseAmount%10<5){
            return 100-((purchaseAmount/10)*10);
        }else{
            return 100-((purchaseAmount/10)*10)-10;
        }
    }
}