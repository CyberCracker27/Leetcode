// Last updated: 8/3/2026, 9:24:43 AM
class Solution {
    public int maxLength(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length;i++){
            int resultgcd=nums[i];
            int resultlcm=nums[i];
            int pro=nums[i];
            int c=1;
            for(int j=i+1;j<nums.length;j++){
                pro*=nums[j];
                c++;
                resultgcd=gcd(resultgcd,nums[j]);
                resultlcm=lcm(resultlcm,nums[j]);
                if(pro==resultgcd*resultlcm){
                    if(c>max){
                        max=c;
                    }
                }
            }
            
        }
        return max;
    }
    public int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
    public int lcm(int a,int b){
        if(a==0 || b==0){
            return 0;
        }
        return Math.abs((a/gcd(a,b))*b);
    }
}