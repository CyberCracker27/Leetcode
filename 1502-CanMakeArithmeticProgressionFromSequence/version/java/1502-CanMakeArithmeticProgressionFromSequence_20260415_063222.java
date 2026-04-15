// Last updated: 15/04/2026, 06:32:22
1class Solution {
2    public boolean canMakeArithmeticProgression(int[] arr) {
3        Arrays.sort(arr);
4        for(int i=1;i<arr.length-1;i++){
5            if(arr[i]-arr[i-1]!=arr[i+1]-arr[i]){
6                return false;
7            }
8        }
9        return true;
10    }
11}