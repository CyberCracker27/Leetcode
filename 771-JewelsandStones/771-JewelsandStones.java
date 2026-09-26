// Last updated: 9/26/2026, 9:57:45 AM
1class Solution {
2    public int numJewelsInStones(String jewels, String stones) {
3        int c=0;
4        for(int i=0;i<jewels.length();i++){
5            for(int j=0;j<stones.length();j++){
6                if(jewels.charAt(i)==stones.charAt(j)){
7                    c++;
8                }
9            }
10        }
11        return c;
12    }
13}