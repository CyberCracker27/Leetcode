// Last updated: 6/9/2026, 9:22:16 AM
1class Solution {
2    public boolean canMakeArithmeticProgression(int[] arr) {
3        Arrays.sort(arr);
4        int a=arr[0]-arr[1];
5        for(int i=1;i<arr.length-1;i++){
6            if(a!=arr[i]-arr[i+1]){
7                return false;
8            }
9        }
10        return true;
11    }
12}