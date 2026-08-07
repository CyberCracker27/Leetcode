// Last updated: 8/7/2026, 7:02:03 AM
class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        int arr[][]=new int[score.length][score[0].length];
        int arr1[]=new int[score.length];
        int j=0;
        for(int i=0;i<score.length;i++){
            arr1[j++]=score[i][k];
        }
        Arrays.sort(arr1);
        int g=0;
        for(int i=score.length-1;i>=0;i--){
            for(int h=0;h<score.length;h++){
                if(arr1[i]==score[h][k]){
                    for(int m=0;m<score[h].length;m++){
                        arr[g][m]=score[h][m];
                    }
                }
            }
            g++;
        }
        return arr;
    }
}