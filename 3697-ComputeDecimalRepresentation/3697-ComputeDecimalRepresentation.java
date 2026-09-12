// Last updated: 9/12/2026, 7:19:00 AM
class Solution {
    public int[] decimalRepresentation(int n) {
        List<Integer> li=new ArrayList<>();
        int c=1;
        while(n!=0){
            int d=n%10;
            if(d!=0){
                li.add(d*c);
            }
            c*=10;
            n/=10;
        }
        int arr[]=new int[li.size()];
        int j=0;
        for(int i=arr.length-1;i>=0;i--){
            arr[i]=li.get(j++);
        }
        return arr;
    }
}