// Last updated: 24/02/2026, 22:10:18
class Solution {
    public int firstUniqueFreq(int[] nums) {
        HashMap<Integer,Integer> a=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            a.put(nums[i],a.getOrDefault(nums[i],0)+1);
        }
        HashMap<Integer,Integer> b=new HashMap<>();
        for(int value:a.values()){
            b.put(value,b.getOrDefault(value,0)+1);
        }
        int d=-1;
        for(int i=0;i<nums.length;i++){
            int key=nums[i];
            int va=a.get(key);
            if(b.get(va)==1){
                return key;
            }
        }
        return d;
    }
}