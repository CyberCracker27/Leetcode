// Last updated: 10/04/2026, 07:01:49
class Solution {
    public int mirrorFrequency(String s) {
        int[] freq=new int[256];
        for(char c:s.toCharArray()){
            freq[c]++;
        }
        int ans=0;
        boolean[] v=new boolean[256];
        for(char c:s.toCharArray()){
            if(v[c]){
                continue;
            }
            char m=getMirror(c);
            if(c==m) continue;
            ans+=Math.abs(freq[c]-freq[m]);
            v[c]=v[m]=true;
        }
        return ans;
    }
    char getMirror(char c){
        if(c>='a' && c<='z'){
            return (char)('a'+'z'-c);
        }else{
            return (char)('0'+'9'-c);
        }
    }
}