// Last updated: 9/12/2026, 7:25:36 AM
class Solution {
    public int numberOfBeams(String[] bank) {
        int ans=0,prev=0;
        int n=bank[0].length();
        for(int i=0;i<bank.length;i++){
            int dev=0;
            for(int j=0;j<n;j++){
                dev+=(bank[i].charAt(j))=='1'?1:0;
            }
            if(dev>0){
                ans+=dev*prev;
                prev=dev;
            }
        }
        return ans;
    }
}