// Last updated: 29/04/2026, 07:23:20
class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        for(int i=1;i<arr.length-1;i++){
            if(arr[i]-arr[i-1]!=arr[i+1]-arr[i]){
                return false;
            }
        }
        return true;
    }
}