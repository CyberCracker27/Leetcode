// Last updated: 9/12/2026, 7:28:55 AM
class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        
        Arrays.sort(arr);
        int c=arr[0];
        for(int i=1;i<arr.length;i++){
            int a=Math.abs(arr[i-1]-arr[i]);
            if(a>1){
                arr[i]=arr[i-1]+1;
            }
            System.out.println(arr[i]);
            c=Math.max(c,arr[i]);
        }
        if(c>arr.length){
            c=arr.length;
        }
        return c;
    }
}