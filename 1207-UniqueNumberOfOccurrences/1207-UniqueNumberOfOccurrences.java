// Last updated: 9/12/2026, 7:36:58 AM
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> a=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            a.put(arr[i],a.getOrDefault(arr[i],0)+1);
        }
        Set<Integer> s= new HashSet<>();
        for(int x:a.values()){
            s.add(x);
        }
        return a.size()==s.size();
    }
}