// Last updated: 7/13/2026, 8:50:00 PM
class Solution {
    public double maxProbability(int n, int[][] edges, double[] succProb, int start_node, int end_node) {
        double[] maxprob=new double[n];
        maxprob[start_node]=1.0;
        for(int i=0;i<n-1;i++){
            boolean updated=false;
            for(int j=0;j<edges.length;j++){
                int u=edges[j][0];
                int v=edges[j][1];
                double prob=succProb[j];
                if(maxprob[u]*prob>maxprob[v]){
                    maxprob[v]=maxprob[u]*prob;
                    updated=true;
                }
                if(maxprob[v]*prob>maxprob[u]){
                    maxprob[u]=maxprob[v]*prob;
                    updated=true;
                }
            }
            if(!updated) break;
        }
        return maxprob[end_node];
    }
}