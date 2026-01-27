// Last updated: 27/01/2026, 07:35:33
1class Solution {
2    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
3        String word3="";
4        String word4="";
5        for(int i=0;i<word1.length;i++){
6            word3=word3+word1[i];
7        }
8        for(int j=0;j<word2.length;j++){
9            word4=word4+word2[j];
10        }
11        if(word3.equals(word4)){
12            return true;
13        }else{
14            return false;
15        }
16    }
17}