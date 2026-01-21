// Last updated: 21/01/2026, 22:09:10
class Solution {
    public boolean isThree(int n) {
        int c=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                c++;
            }
            if(c>3){
                break;
            }
        }
        if(c==3){
            return true;
        }else{
            return false;
        }
    }
}