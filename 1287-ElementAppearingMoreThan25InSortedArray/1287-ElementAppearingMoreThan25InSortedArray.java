// Last updated: 9/12/2026, 7:37:42 AM
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