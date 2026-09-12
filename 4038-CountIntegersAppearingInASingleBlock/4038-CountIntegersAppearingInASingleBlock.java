// Last updated: 9/12/2026, 7:16:07 AM
class Solution {
    public int countSpecialIntegers(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> first=new HashMap<>();
        HashMap<Integer,Integer> last=new HashMap<>();
        HashMap<Integer,Integer> count=new HashMap<>();
        for(int i=0;i<n;i++){
            int x=nums[i];
            first.putIfAbsent(x,i);
            last.put(x,i);
            count.put(x,count.getOrDefault(x,0)+1);
        }
        int s=0;
        for(int x:count.keySet()){
            int f=first.get(x);
            int l=last.get(x);
            int c=count.get(x);
            if(l-f+1==c){
                s++;
            }
        }
        return s;
    }
}