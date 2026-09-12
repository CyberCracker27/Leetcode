// Last updated: 9/12/2026, 7:22:47 AM
class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        if(arrivalTime+delayedTime<24){
            return arrivalTime+delayedTime;
        }else{
            return arrivalTime+delayedTime-24;
        }
    }
}