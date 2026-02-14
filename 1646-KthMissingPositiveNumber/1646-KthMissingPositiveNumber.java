// Last updated: 14/02/2026, 07:50:36
class Solution {
    public int findKthPositive(int[] arr, int k) {
        int j=0;
        int f=0;
        while(true){
            j++;
            boolean a=true;
            for(int i=0;i<arr.length;i++){
                if(j==arr[i]){
                    a=false;
                    break;
                }
            }
            if(a){
                f++;
            }
            if(f==k){
                return j;
            }
        }
    }
}