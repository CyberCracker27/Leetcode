// Last updated: 21/01/2026, 22:09:21
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int n=numBottles;
        int sum=n;
        if(numExchange>numBottles) return numBottles;
        while(n>=numExchange){
            int t=n;
            n=(n/numExchange);
            sum+=n;
            n+=(t%numExchange);
        }
        return sum;
    }
}