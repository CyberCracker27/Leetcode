// Last updated: 9/12/2026, 7:37:38 AM
class Solution {
    public int[] replaceElements(int[] arr) {
        int a[]=new int[arr.length];
        int k=0;
        a[arr.length-1]=-1;
        for(int i=1;i<arr.length;i++){
            int c=arr[i];
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>c){
                    c=arr[j];
                }
            }
            a[k++]=c;
        }
        return a;
    }
}