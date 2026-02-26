// Last updated: 26/02/2026, 06:51:57
1class Solution {
2    public List<String> stringMatching(String[] words) {
3        List<String> a=new ArrayList<>();
4        for(int i=0;i<words.length;i++){
5            for(int j=0;j<words.length;j++){
6                if(i!=j){
7                    if(words[j].contains(words[i])){
8                        a.add(words[i]);
9                        break;
10                    }
11                }
12            }
13        }
14        return a;
15    }
16}