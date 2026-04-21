// Last updated: 21/04/2026, 07:30:08
class Solution {
    public int[] minCosts(int[] cost) {
        int[] n=new int[cost.length];
        int min=cost[0];
        for(int i=0;i<cost.length;i++){
            if(cost[i]<min){
                min=cost[i];
            }
            n[i]=min;
        }
        return n;
    }
}