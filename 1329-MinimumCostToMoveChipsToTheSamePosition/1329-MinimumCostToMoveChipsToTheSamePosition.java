// Last updated: 21/01/2026, 22:09:39
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