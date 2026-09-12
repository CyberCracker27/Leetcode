// Last updated: 9/12/2026, 7:22:44 AM
class Solution {
    public int sumOfMultiples(int n) {
        int c=0;
        for(int i=1;i<=n;i++){
            if(i%3==0 || i%5==0 || i%7==0){
                c+=i;
            }
        }
        return c;
    }
}