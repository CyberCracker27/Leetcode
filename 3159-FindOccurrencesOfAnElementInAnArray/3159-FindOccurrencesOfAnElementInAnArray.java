// Last updated: 9/12/2026, 7:21:09 AM
class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        int arr[]=new int[queries.length];
        Map<Integer,Integer> map=new HashMap<>();
        int c=1;
        for(int j=0;j<nums.length;j++){
            if(x==nums[j]){
                map.put(c,j);
                c++;
            }
        }
        for(int i=0;i<queries.length;i++){
            if(map.containsKey(queries[i])){
                arr[i]=map.get(queries[i]);
            }else{
                arr[i]=-1;
            }
            
        }
        return arr;
    }
}