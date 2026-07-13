// Last updated: 7/13/2026, 8:53:01 PM
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer> frq=new HashMap<>();
        List<Integer> a=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            frq.put(nums[i],frq.getOrDefault(nums[i],0)+1);
        }
        int c=n/3;
        for(int x:frq.keySet()){
            if(frq.get(x)>c){
                a.add(x);
            }
        }
        if(a.size()==0 && nums.length>=3){
            return a;
        }
        if(a.size()==0){
            for(int i=0;i<nums.length;i++){
                a.add(nums[i]);
            }
            return a;
        }
        else{
            return a;
        }
    }
}