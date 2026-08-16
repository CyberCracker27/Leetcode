// Last updated: 8/16/2026, 8:26:55 AM
1class Solution {
2    public int nearestDrone(int[][] drones, int[] target) {
3        int min=Integer.MAX_VALUE;
4        int f=-1;
5        for(int i=0;i<drones.length;i++){
6            int c=Math.abs(drones[i][0]-target[0])+Math.abs(drones[i][1]-target[1]);
7            if(c<=drones[i][2] && c<min){
8                min=c;
9                f=i;
10            }
11        }
12        return f;
13    }
14}