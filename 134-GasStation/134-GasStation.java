// Last updated: 21/01/2026, 22:11:11
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total=0,tcost=0;
        for(int i=0;i<gas.length;i++){
            total+=gas[i];
            tcost+=cost[i];
        }
        if(total<tcost) return -1;
        int rem=0,start=0;
        for(int i=0;i<gas.length;i++){
            rem=rem+(gas[i]-cost[i]);
            if(rem<0){
                start =i+1;
                rem=0;
            }
        }
        return start;
    }
}