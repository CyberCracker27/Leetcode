// Last updated: 8/18/2026, 6:48:11 AM
class Solution {
    public int digitFrequencyScore(int n) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int s=0;
        while(n!=0){
            int c=n%10;
            map.put(c,map.getOrDefault(c,0)+1);
            n/=10;
        }
        for(int x:map.keySet()){
            s+=x*map.get(x);
        }
        return s;
    }
}