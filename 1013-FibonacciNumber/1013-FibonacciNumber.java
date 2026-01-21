// Last updated: 21/01/2026, 22:09:47
class Solution {
    public int fib(int n) {
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1; 
        }else{
            return fib(n-1)+fib(n-2);
        }
    }
}