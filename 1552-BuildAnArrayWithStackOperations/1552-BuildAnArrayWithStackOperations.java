// Last updated: 7/13/2026, 8:49:39 PM
class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> li=new ArrayList<>();
        int[] arr=new int[target.length];
        int l=target.length;
        int j=0;
        for(int i=1;i<=n;i++){
            if(j<l){
                arr[j++]=i;
                li.add("Push");
            }
            boolean a=true;
            for(int k=0;k<target.length;k++){
                if(target[k]!=arr[k] ){
                    if(arr[k]!=0){
                        arr[k]=0;
                        j--;
                        li.add("Pop");
                    }
                    a=false;
                    break;
                }  
            }
            if(a){
                break;
            }
        }
        return li;
    }
}