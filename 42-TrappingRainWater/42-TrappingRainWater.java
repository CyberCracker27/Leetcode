// Last updated: 7/13/2026, 8:55:05 PM
class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int leftmax=0;
        int rightmax=0;
        int larr[]=new int[n];
        int rarr[]=new int[n];
        int farr[]=new int[n];
        int c=0;
        for(int i=0;i<n;i++){
            leftmax=Math.max(leftmax,height[i]);
            larr[i]=leftmax;
        }
        for(int i=n-1;i>=0;i--){
            rightmax=Math.max(rightmax,height[i]);
            rarr[i]=rightmax;
        }
        for(int i=0;i<n;i++){
            farr[i]=Math.min(larr[i],rarr[i]);
            c+=Math.abs(farr[i]-height[i]);
        }
        return c;
    }
}