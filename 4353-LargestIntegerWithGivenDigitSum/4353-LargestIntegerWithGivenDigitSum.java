// Last updated: 7/27/2026, 7:19:22 AM
class Solution {
    public int largestInteger(int n, int s) {
        if(s==0) return 0;
        if(s>n*9) return -1;
        int ans=0;
        for(int i=0;i<n;i++){
            int digit=Math.min(9,s);
            ans=ans*10+digit;
            s-=digit;
        }
        return ans;
    }
}