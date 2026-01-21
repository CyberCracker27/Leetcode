// Last updated: 21/01/2026, 22:09:44
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