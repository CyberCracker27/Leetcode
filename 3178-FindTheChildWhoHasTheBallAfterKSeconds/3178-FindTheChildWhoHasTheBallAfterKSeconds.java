// Last updated: 9/12/2026, 7:20:59 AM
class Solution {
    public int numberOfChild(int n, int k) {
        n--;
        int ron=k/n;
        int rem=k%n;
        if(ron%2==0){
            return rem;
        }else{
            return n-rem;
        }
    }
}