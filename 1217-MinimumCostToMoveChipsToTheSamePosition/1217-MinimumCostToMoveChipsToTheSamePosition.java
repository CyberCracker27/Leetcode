// Last updated: 9/12/2026, 7:36:50 AM
class Solution {
    public int minCostToMoveChips(int[] p) {
        int evencount=0;
        int oddcount=0;
        for(int a:p){
            if(a%2==0){
                evencount++;
            }else{
                oddcount++;
            }
        }
        return (evencount<oddcount)?evencount:oddcount;
    }
}