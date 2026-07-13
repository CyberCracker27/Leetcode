// Last updated: 7/13/2026, 8:54:49 PM
class Solution {
    public int minDistance(String word1, String word2) {
        int[][] arr=new int[word2.length()+1][word1.length()+1];
        for(int i=0;i<=word2.length();i++){
            arr[i][0]=i;
        }
        for(int i=0;i<=word1.length();i++){
            arr[0][i]=i;
        }
        for(int i=1;i<=word2.length();i++){
            for(int j=1;j<=word1.length();j++){
                if(word2.charAt(i-1)==word1.charAt(j-1)){
                    arr[i][j]=arr[i-1][j-1];
                }else{
                    arr[i][j]=1+Math.min(arr[i-1][j-1],Math.min(arr[i-1][j],arr[i][j-1]));
                }
            }
        }
        return arr[word2.length()][word1.length()];
    }
}