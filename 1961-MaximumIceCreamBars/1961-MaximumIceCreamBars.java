// Last updated: 7/13/2026, 8:48:55 PM
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