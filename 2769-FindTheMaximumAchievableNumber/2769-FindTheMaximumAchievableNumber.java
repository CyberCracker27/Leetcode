// Last updated: 9/12/2026, 7:22:32 AM
class Solution {
    public int theMaximumAchievableX(int num, int t) {
        int x=num+t;
        for(int i=1;i<=t;i++){
            if(++num==x){
                x++;
                break;
            }
            x++;
        }
        return x;
    }
}