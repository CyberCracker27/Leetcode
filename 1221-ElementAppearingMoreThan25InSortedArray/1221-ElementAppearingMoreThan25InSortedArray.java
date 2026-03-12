// Last updated: 12/03/2026, 22:12:59
class Solution {
    public int findSpecialInteger(int[] arr) {
        HashMap<Integer,Integer> a=new HashMap<>();
        for(int ar:arr){
            a.put(ar,a.getOrDefault(ar,0)+1);
        }
        int max=0;
        int b=0;
        for(int k:a.keySet()){
            if(a.get(k)>max){
                max=a.get(k);
                b=k;
            }
        }
        return b;
    }
}