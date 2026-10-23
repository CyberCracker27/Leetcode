// Last updated: 10/23/2026, 7:22:09 AM
1class Solution {
2    public int countCompleteDayPairs(int[] hours) {
3        int c=0;
4        for(int i=0;i<hours.length;i++){
5            for(int j=i+1;j<hours.length;j++){
6                if((hours[i]+hours[j])%24==0){
7                    c++;
8                }
9            }
10        }
11        return c;
12    }
13}