// Last updated: 21/01/2026, 22:08:30
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