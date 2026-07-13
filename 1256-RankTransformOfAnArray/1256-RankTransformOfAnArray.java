// Last updated: 7/13/2026, 8:50:11 PM
class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int arr1[]=arr.clone();
        Arrays.sort(arr1);
        HashMap<Integer,Integer> map=new HashMap<>();
        int r=1;
        for(int x:arr1){
            if(!map.containsKey(x)){
                map.put(x,r);
                r++;
            }
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=map.get(arr[i]);
        }
        return arr;
    }
}