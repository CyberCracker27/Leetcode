// Last updated: 7/13/2026, 8:52:06 PM
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[1]-b[1]);
        int ans=0,n=intervals.length;
        int end=Integer.MIN_VALUE;
        for(int[] i:intervals){
            if(end>i[0]) ans++;
            else{
                end=i[1];
            }
        }
        return ans;
    }
}