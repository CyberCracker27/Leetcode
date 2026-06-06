// Last updated: 6/6/2026, 9:54:06 AM
1class Solution {
2    public int longestPalindromeSubseq(String s) {
3        HashMap<String,Integer> map=new HashMap<>();
4        return rec(s,0,s.length()-1,map);
5    }
6    public int rec(String s,int left,int right,HashMap<String,Integer> map){
7        if(left>right) return 0;
8        if(left==right) return 1;
9        String t=left+","+right;
10        int ans;
11        if(map.containsKey(t)) return map.get(t);
12        if(s.charAt(left)==s.charAt(right)) ans=2+rec(s,left+1,right-1,map);
13        else ans= Math.max(rec(s,left+1,right,map),rec(s,left,right-1,map));
14        map.put(t,ans);
15        return ans;
16    }
17}