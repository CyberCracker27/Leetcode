// Last updated: 12/03/2026, 22:13:03
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