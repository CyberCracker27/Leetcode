// Last updated: 8/3/2026, 9:26:26 AM
class Solution {
    public int[] findArray(int[] pref) {
        int arr[]=new int[pref.length];
        arr[0]=pref[0];
        int c=0;
        for(int i=1;i<pref.length;i++){
            c=c^arr[i-1];
            arr[i]=c^pref[i];
        }
        return arr;
    }
}