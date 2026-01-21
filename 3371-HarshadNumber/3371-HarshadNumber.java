// Last updated: 21/01/2026, 22:08:23
class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int c=0;
        int t=x;
        while(x!=0){
            c+=(x%10);
            x/=10;
        }
        if(t%c==0){
            return c;
        }else{
            return -1;
        }
    }
}