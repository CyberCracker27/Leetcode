// Last updated: 8/18/2026, 6:50:00 AM
class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        List<List<Integer>> lio=new ArrayList<>();
        for(int x:nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        while(!map.isEmpty()){
            List<Integer> li=new ArrayList<>();
            for(int x:new ArrayList<>(map.keySet())){
                if(map.get(x)==1){
                    li.add(x);
                    map.remove(x);
                }
                else{
                    map.put(x,map.get(x)-1);
                    li.add(x);
                }
            }
            lio.add(li);
        }
        return lio;
    }
}