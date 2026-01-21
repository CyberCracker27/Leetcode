// Last updated: 21/01/2026, 22:08:45
class Solution {
    public int pivotInteger(int n) {
        int c=0;
        int e=-1;
        for(int i=1;i<=n;i++){
            c+=i;
            int d=0;
            for(int j=i;j<=n;j++){
                d+=j;
                
            }
            if(c==d){
                e=i;   
            }
        }
        return e;
    }
}