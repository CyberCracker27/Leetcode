// Last updated: 9/12/2026, 7:35:51 AM
class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int c=0;
        int j=-1;
        int f=0;
        for(int i=0;i<arr.length;i++){
            c+=arr[i];
            if(i>=k-1){
                if(c/k>=threshold){
                    f++;
                }
                j++;

                c-=arr[j];
            }
        }
        return f;
    }
}