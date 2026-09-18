// Last updated: 9/18/2026, 6:48:55 AM
1class Solution {
2    public int[][] flipAndInvertImage(int[][] image) {
3        for(int i=0;i<image.length;i++){
4            int l=0,m=image[i].length-1;
5            while(l<m){
6                int temp=image[i][l];
7                image[i][l]=image[i][m];
8                image[i][m]=temp;
9                l++;
10                m--;
11            }
12        }
13        for(int i=0;i<image.length;i++){
14            for(int j=0;j<image[0].length;j++){
15                if(image[i][j]==0){
16                    image[i][j]=1;
17                }else{
18                    image[i][j]=0;
19                }
20            }
21        }
22        return image;
23    }
24}