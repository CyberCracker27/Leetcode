// Last updated: 9/12/2026, 7:15:55 AM
class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
        int min=Integer.MAX_VALUE;
        int f=-1;
        for(int i=0;i<drones.length;i++){
            int c=Math.abs(drones[i][0]-target[0])+Math.abs(drones[i][1]-target[1]);
            if(c<=drones[i][2] && c<min){
                min=c;
                f=i;
            }
        }
        return f;
    }
}