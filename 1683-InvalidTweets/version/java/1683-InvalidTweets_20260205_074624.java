// Last updated: 05/02/2026, 07:46:24
1class Solution {
2    public int countConsistentStrings(String allowed, String[] words) {
3        int c=0;
4        for(int i=0;i<words.length;i++){
5            boolean a=true;
6            for(int j=0;j<words[i].length();j++){
7                if(!allowed.contains(String.valueOf(words[i].charAt(j)))){
8                    a=false;
9                    break;
10                }
11            }
12            if(a){
13                c++;
14            }
15        }
16        return c;
17    }
18}