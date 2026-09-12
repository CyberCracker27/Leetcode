// Last updated: 9/12/2026, 7:22:35 AM
class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=A.length;
        int count=0;
        for(int i=0;i<n;i++){
            map.put(A[i],map.getOrDefault(A[i],0)+1);
            map.put(B[i],map.getOrDefault(B[i],0)+1);
            if(map.get(A[i])==2){
                count++;
            }
            if(A[i]!=B[i] && map.get(B[i])==2){
                count++;
            }
            A[i]=count;
        }
        return A;
    }
}