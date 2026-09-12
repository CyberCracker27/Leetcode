// Last updated: 9/12/2026, 7:36:00 AM
class Solution {
    public int numberOfSteps(int num) {
        int c=0;
        while(num!=0){
            if(num%2==0){
                c++;
                num/=2;
            }else{
                c++;
                num--;
            }
        }
        return c;
    }
}