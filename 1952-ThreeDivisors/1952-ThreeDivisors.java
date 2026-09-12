// Last updated: 9/12/2026, 7:27:24 AM
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