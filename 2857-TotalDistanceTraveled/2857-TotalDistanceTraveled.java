// Last updated: 21/01/2026, 22:08:28
class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int sum=0;
        while(mainTank>=5 && additionalTank>0){
            sum+=50;
            if(additionalTank>0){
                mainTank=(mainTank-5)+1;
                additionalTank--;
            }
        }
        sum+=(mainTank*10);
        return sum;
    }
}