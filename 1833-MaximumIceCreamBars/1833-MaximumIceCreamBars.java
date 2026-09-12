// Last updated: 9/12/2026, 7:28:20 AM
class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int i=0;
        int c=0;
        Arrays.sort(costs);
        for(int j=0;j<costs.length;j++){
            if(i+costs[j]>coins){
                continue;
            }else{
                i+=costs[j];
                c++;
            }

        }
        return c;
    }
}