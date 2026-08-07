// Last updated: 8/7/2026, 6:47:32 AM
1class Solution {
2    public int[][] sortTheStudents(int[][] score, int k) {
3        int arr[][]=new int[score.length][score[0].length];
4        int arr1[]=new int[score.length];
5        int j=0;
6        for(int i=0;i<score.length;i++){
7            arr1[j++]=score[i][k];
8        }
9        Arrays.sort(arr1);
10        int g=0;
11        for(int i=score.length-1;i>=0;i--){
12            for(int h=0;h<score.length;h++){
13                if(arr1[i]==score[h][k]){
14                    for(int m=0;m<score[h].length;m++){
15                        arr[g][m]=score[h][m];
16                    }
17                }
18            }
19            g++;
20        }
21        return arr;
22    }
23}