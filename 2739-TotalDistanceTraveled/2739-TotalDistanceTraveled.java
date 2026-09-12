// Last updated: 9/12/2026, 7:22:19 AM
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