// Last updated: 6/8/2026, 8:48:37 PM
class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes,(a,b)->b[1]-a[1]);
        int c=truckSize;
        int i=0;
        int s=0;
        while(c>0 && i<boxTypes.length){
            int temp=boxTypes[i][0];
            if(temp<=c){
                c=c-temp;
                s+=temp*boxTypes[i++][1];
            }else{
                s+=c*boxTypes[i][1];
                c=0;
            }
        }

        return s;
    }
}