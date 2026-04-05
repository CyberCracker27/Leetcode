// Last updated: 05/04/2026, 08:15:43
1class Solution {
2    public int mirrorFrequency(String s) {
3        int[] freq=new int[256];
4        for(char c:s.toCharArray()){
5            freq[c]++;
6        }
7        int ans=0;
8        boolean[] v=new boolean[256];
9        for(char c:s.toCharArray()){
10            if(v[c]){
11                continue;
12            }
13            char m=getMirror(c);
14            if(c==m) continue;
15            ans+=Math.abs(freq[c]-freq[m]);
16            v[c]=v[m]=true;
17        }
18        return ans;
19    }
20    char getMirror(char c){
21        if(c>='a' && c<='z'){
22            return (char)('a'+'z'-c);
23        }else{
24            return (char)('0'+'9'-c);
25        }
26    }
27}