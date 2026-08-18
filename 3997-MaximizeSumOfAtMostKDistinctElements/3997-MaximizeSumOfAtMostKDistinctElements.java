// Last updated: 8/18/2026, 6:48:52 AM
class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        HashSet<Integer> set=new HashSet<>();
        for(int x:nums){
            set.add(x);
        }
        int c=set.size();
        int arr[]=new int[c];
        int i=0;
        for(int x:set){
            arr[i++]=x;
        }
        Arrays.sort(arr);
        int arr1[];
        if(c<k){
            arr1=new int[c];
            for(int j=0;j<c;j++){
                arr1[j]=arr[c-j-1];
            }
            return arr1;
        }
        arr1=new int[k];
        c--;
        for(int j=0;j<k;j++){
            arr1[j]=arr[c--];
        }
        return arr1;
    }
}