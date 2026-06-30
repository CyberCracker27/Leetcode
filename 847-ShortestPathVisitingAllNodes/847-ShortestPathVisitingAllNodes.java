// Last updated: 6/30/2026, 9:07:06 AM
1class Solution {
2    public double maxProbability(int n, int[][] edges, double[] succProb, int start_node, int end_node) {
3        double[] maxprob=new double[n];
4        maxprob[start_node]=1.0;
5        for(int i=0;i<n-1;i++){
6            boolean updated=false;
7            for(int j=0;j<edges.length;j++){
8                int u=edges[j][0];
9                int v=edges[j][1];
10                double prob=succProb[j];
11                if(maxprob[u]*prob>maxprob[v]){
12                    maxprob[v]=maxprob[u]*prob;
13                    updated=true;
14                }
15                if(maxprob[v]*prob>maxprob[u]){
16                    maxprob[u]=maxprob[v]*prob;
17                    updated=true;
18                }
19            }
20            if(!updated) break;
21        }
22        return maxprob[end_node];
23    }
24}