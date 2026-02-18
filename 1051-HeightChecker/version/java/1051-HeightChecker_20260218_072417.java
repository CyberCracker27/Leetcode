// Last updated: 18/02/2026, 07:24:17
1class Solution {
2    public int heightChecker(int[] heights) {
3        int[] a=new int[heights.length];
4        for(int i=0;i<heights.length;i++){
5            a[i]=heights[i];
6        }
7        int c=0;
8        Arrays.sort(heights);
9        for(int i=0;i<heights.length;i++){
10            if(a[i]!=heights[i]){
11                c++;
12            }
13        }
14        return c;
15    }
16}