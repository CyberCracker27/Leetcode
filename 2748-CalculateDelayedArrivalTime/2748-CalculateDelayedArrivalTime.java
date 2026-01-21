// Last updated: 21/01/2026, 22:08:33
class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        if(arrivalTime+delayedTime<24){
            return arrivalTime+delayedTime;
        }else{
            return arrivalTime+delayedTime-24;
        }
    }
}