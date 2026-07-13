// Last updated: 7/13/2026, 8:46:13 PM
class Solution {
    public int getLeastFrequentDigit(int n) {
        int min=Integer.MAX_VALUE; 
        int c=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        while(n!=0){
            int t=n%10;
            map.put(t,map.getOrDefault(t,0)+1);
            n/=10;
        }
        for(int x:map.keySet()){
            if(map.get(x)<min){
                min=map.get(x);
                c=x;
            }
        }
        return c;
    }
}