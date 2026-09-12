// Last updated: 9/12/2026, 7:20:15 AM
class Solution {
    public int countPartitions(int[] nums) {
        int c=0;
        int b=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            c+=nums[i];
            b=0;
            for(int j=i+1;j<nums.length;j++){
                b+=nums[j];
            }
            if(Math.abs(c-b)%2==0 && i!=nums.length-1){
                //System.out.print(b+" "+c+" ");
                count++;
            }
        } 
        return count;
    }
}