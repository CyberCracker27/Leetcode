// Last updated: 6/6/2026, 3:05:58 PM
1class Solution {
2    public int minDistance(String word1, String word2) {
3        int[][] arr=new int[word2.length()+1][word1.length()+1];
4        for(int i=0;i<=word2.length();i++){
5            arr[i][0]=i;
6        }
7        for(int i=0;i<=word1.length();i++){
8            arr[0][i]=i;
9        }
10        for(int i=1;i<=word2.length();i++){
11            for(int j=1;j<=word1.length();j++){
12                if(word2.charAt(i-1)==word1.charAt(j-1)){
13                    arr[i][j]=arr[i-1][j-1];
14                }else{
15                    arr[i][j]=1+Math.min(arr[i-1][j-1],Math.min(arr[i-1][j],arr[i][j-1]));
16                }
17            }
18        }
19        return arr[word2.length()][word1.length()];
20    }
21}