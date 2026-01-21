// Last updated: 21/01/2026, 22:09:23
class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer> a=new HashMap<>();
        int count=0;
        for(int num:nums){
            if(a.containsKey(num)){
                a.put(num,a.get(num)+1);
            }else{
                a.put(num,1);
            }
        }
        int pairs=0;
        for(int x:a.values()){
            pairs+=(x*(x-1))/2;
        }
        return pairs;
    }
}