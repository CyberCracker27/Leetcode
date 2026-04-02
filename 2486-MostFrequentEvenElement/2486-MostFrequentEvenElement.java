// Last updated: 02/04/2026, 07:35:16
class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer> a=new HashMap<>();
        int max=0;
        int b=-1;
        Arrays.sort(nums);
        for(int i:nums){
            a.put(i,a.getOrDefault(i,0)+1);
        }
        for(Integer i:a.keySet()){
            if(i%2==0){
                if(a.get(i)>max || (a.get(i)==max && i<b)){
                    max=a.get(i);
                    b=i;
                }
            }
        }
        return b;
    }
}