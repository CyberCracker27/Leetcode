// Last updated: 14/02/2026, 07:50:43
class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int c=0;
        for(int i=0;i<startTime.length;i++){
            if(startTime[i]<=queryTime && endTime[i]>=queryTime){
                c++;
            }
        }
        return c;
    }
}