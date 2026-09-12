// Last updated: 9/12/2026, 7:16:51 AM
class Solution {
    public int[] countOppositeParity(int[] nums) {
        int arr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int c=0;
            if(i<nums.length-1){
                if(nums[i]%2==0){
                    for(int j=i;j<nums.length;j++){
                        if(nums[j]%2!=0){
                            c++;
                        }
                    }
                }else{
                    for(int j=i;j<nums.length;j++){
                        if(nums[j]%2==0){
                            c++;
                        }
                    }
                }
            }
            arr[i]=c;
        }
        return arr;
    }
}