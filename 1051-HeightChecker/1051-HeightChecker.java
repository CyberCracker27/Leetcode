// Last updated: 9/12/2026, 7:38:08 AM
class Solution {
    public int heightChecker(int[] heights) {
        int[] a=new int[heights.length];
        for(int i=0;i<heights.length;i++){
            a[i]=heights[i];
        }
        int c=0;
        Arrays.sort(heights);
        for(int i=0;i<heights.length;i++){
            if(a[i]!=heights[i]){
                c++;
            }
        }
        return c;
    }
}