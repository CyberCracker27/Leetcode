// Last updated: 28/01/2026, 08:09:43
class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        HashMap<Integer,Integer> a=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(a.containsKey(nums[i])){
                a.put(nums[i],a.get(nums[i])+1);
            }else{
                a.put(nums[i],1);
            }
        }
        int sum=0;
        for(int b:a.keySet()){
            if(a.get(b)%k==0){
                sum=sum+(a.get(b))*b;
            }
        }
        return sum;
    }
}