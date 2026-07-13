// Last updated: 7/13/2026, 8:45:17 PM
class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        String arr1[]=startTime.split(":");
        String arr2[]=endTime.split(":");
        int sec1=0;
        int sec2=0;
        sec1+=Integer.parseInt(arr1[0])*3600+Integer.parseInt(arr1[1])*60+Integer.parseInt(arr1[2]);
        sec2+=Integer.parseInt(arr2[0])*3600+Integer.parseInt(arr2[1])*60+Integer.parseInt(arr2[2]);
        return sec2-sec1;
    }
}