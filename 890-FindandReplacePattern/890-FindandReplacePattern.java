// Last updated: 9/23/2026, 6:55:20 AM
1class Solution {
2    public List<String> findAndReplacePattern(String[] words, String pattern) {
3        List<String> res=new ArrayList<>();
4        for(String word:words){
5            if(check(word,pattern)){
6                res.add(word);
7            }
8        }
9        return res;
10    }
11    boolean check(String a,String b){
12        for(int i=0;i<a.length();i++){
13            if(a.indexOf(a.charAt(i))!=b.indexOf(b.charAt(i))) return false;
14        }
15        return true;
16    }
17}