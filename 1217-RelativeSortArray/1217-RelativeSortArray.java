// Last updated: 12/03/2026, 22:13:00
class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int a[]=new int[arr1.length];
        int k=0;
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr1.length;j++){
                if(arr2[i]==arr1[j]){
                    a[k++]=arr1[j];
                }
            }
        }
        List<Integer> b=new ArrayList<>();
        for(int j=0;j<arr1.length;j++){
            boolean d=true;
            for(int i=0;i<arr2.length;i++){
                if(arr1[j]==arr2[i]){
                    d=false;
                    break;
                }
            }
            if(d){
                b.add(arr1[j]);
            }
        }
        int c[]=new int[b.size()];
        int i=0;
        for(int x:b){
            c[i++]=x;
        }
        Arrays.sort(c);
        for(int y:c){
            a[k++]=y;
        }
        return a;
    }
}