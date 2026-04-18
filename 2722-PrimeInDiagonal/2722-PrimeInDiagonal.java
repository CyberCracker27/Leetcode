// Last updated: 18/04/2026, 07:08:36
class Solution {
    public int diagonalPrime(int[][] nums) {
        int i=0,j=nums.length-1;
        int max=0;
        while(j>=0){
            if(isprime(nums[i][j])){
                if(nums[i][j]>max){
                    max=nums[i][j];
                }
            }
            i++;
            j--;
        }
        for(int k=0;k<nums.length;k++){
            for(int l=0;l<nums.length;l++){
                if(k==l){
                    if(isprime(nums[k][l])){
                        if(nums[k][l]>max){
                            max=nums[k][l];
                        }
                    }
                }
            }
        }
        return max;
    }
    public boolean isprime(int n){
        if(n<2){
            return false;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}