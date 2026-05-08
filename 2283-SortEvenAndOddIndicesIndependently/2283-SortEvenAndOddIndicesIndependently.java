// Last updated: 5/8/2026, 7:27:29 AM
class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int a[]=new int[(nums.length+1)/2];
        int b[]=new int[nums.length/2];
        int j=0,k=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                a[j++]=nums[i];
            }else{
                b[k++]=nums[i];
            }
        }
        j=0;
        k=0;
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i=0;i<b.length/2;i++){
            int temp=b[i];
            b[i]=b[b.length-1-i];
            b[b.length-1-i]=temp;
        }
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                nums[i]=a[j++];
            }else{
                nums[i]=b[k++];
            }
        }
        return nums;
    }
}