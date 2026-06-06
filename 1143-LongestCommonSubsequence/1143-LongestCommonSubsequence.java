// Last updated: 6/6/2026, 10:45:51 AM
1class Solution {
2    public int longestCommonSubsequence(String text1, String text2) {
3        HashMap<String,Integer> map=new HashMap<>();
4        return rec(text1,text2,0,0,map);
5    }
6    public int rec(String t1,String t2,int left,int right,HashMap<String,Integer> map){
7        if(left>=t1.length() || right>=t2.length()){
8            return 0;
9        }
10        String s=left+","+right;
11        int ans;
12        if(map.containsKey(s)){
13            return map.get(s);
14        }
15        if(t1.charAt(left)==t2.charAt(right)){
16            ans=1+rec(t1,t2,left+1,right+1,map);
17        }else{
18            ans=Math.max(rec(t1,t2,left+1,right,map),rec(t1,t2,left,right+1,map));
19        }
20        map.put(s,ans);
21        return ans;
22    }
23}