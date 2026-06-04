// Last updated: 6/4/2026, 10:30:46 AM
1class Solution {
2    public int maximumUnits(int[][] boxTypes, int truckSize) {
3        Arrays.sort(boxTypes,(a,b)->b[1]-a[1]);
4        int c=truckSize;
5        int i=0;
6        int s=0;
7        while(c>0 && i<boxTypes.length){
8            int temp=boxTypes[i][0];
9            if(temp<=c){
10                c=c-temp;
11                s+=temp*boxTypes[i++][1];
12            }else{
13                s+=c*boxTypes[i][1];
14                c=0;
15            }
16        }
17
18        return s;
19    }
20}