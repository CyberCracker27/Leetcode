// Last updated: 21/01/2026, 22:09:35
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