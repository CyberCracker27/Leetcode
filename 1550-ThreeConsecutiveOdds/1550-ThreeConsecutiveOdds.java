// Last updated: 9/12/2026, 7:37:15 AM
class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        for(int i=0;i<arr.length-2;i++){
            boolean a=true;
            for(int j=i;j<i+3;j++){
                if(arr[j]%2==0){
                    a=false;
                }
            }
            if(a){
                return true;
            }
        }
        return false;
    }
}