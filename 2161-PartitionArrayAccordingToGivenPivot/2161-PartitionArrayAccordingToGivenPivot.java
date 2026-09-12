// Last updated: 9/12/2026, 7:25:17 AM
class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> li1=new ArrayList<>();
        List<Integer> li2=new ArrayList<>();
        List<Integer> li3=new ArrayList<>();
        for(int x:nums){
            if(x<pivot){
                li1.add(x);
            }else if(x==pivot){
                li3.add(x);
            }else{
                li2.add(x);
            }
        }
        int arr[]=new int[nums.length];
        int i=0;
        for(int x:li1){
            arr[i++]=x;
        }
        for(int x:li3){
            arr[i++]=x;
        }
        for(int x:li2){
            arr[i++]=x;
        }
        return arr;
    }
}