// Last updated: 7/13/2026, 8:54:57 PM
class Solution {
    public String getPermutation(int n, int k) {
        List<Integer> arr=new ArrayList<>();
        int f=1;
        for(int i=1;i<=n;i++){
            arr.add(i);
            f*=i;
        }
        f/=n;
        k-=1;
        String s="";
        while(n>0){
            int i=k/f;
            s=s+arr.get(i);
            arr.remove(i);
            n-=1;
            k%=f;
            if(n!=0) f/=n;
        }
        return s;
    }
}