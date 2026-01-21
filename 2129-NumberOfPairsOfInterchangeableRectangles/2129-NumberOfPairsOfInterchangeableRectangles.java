// Last updated: 21/01/2026, 22:09:04
class Solution {
    public long interchangeableRectangles(int[][] nums) {
        HashMap<Double,Integer> a=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            double c=(double)nums[i][0]/nums[i][1];
            if(a.containsKey(c)){
                a.put(c,a.get(c)+1);
            }else{
                a.put(c,1);
            }
        }
        long b=0;
        for(long x:a.values()){
            System.out.print(x);
            b+=(x*(x-1))/2;
        }
        return b;
    }
}