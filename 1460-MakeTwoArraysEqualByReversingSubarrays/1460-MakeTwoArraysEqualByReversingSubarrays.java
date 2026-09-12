// Last updated: 9/12/2026, 7:34:46 AM
class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(target);
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=target[i]){
                return false;
            }
        }
        return true;
    }
}