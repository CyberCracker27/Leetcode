// Last updated: 9/17/2026, 7:21:51 AM
class Solution {
    public int[][] sortMatrix(int[][] mat) {
        int m=mat.length,n=mat[0].length;
        for(int i=0;i<m;i++){
            List<Integer> li=new ArrayList<>();
            int j=0,k=i;
            li.add(mat[k][j]);
            while(k+1<m && j+1<n){
                li.add(mat[k+1][j+1]);
                k++;
                j++;
            }
            Collections.sort(li);
            int a=li.size()-1;
            j=0;k=i;
            mat[k][j]=li.get(a--);
            while(k+1<m && j+1<n){
                mat[k+1][j+1]=li.get(a--);
                k++;
                j++;
            }
        }
        for(int i=1;i<n;i++){
            List<Integer> li=new ArrayList<>();
            int j=0,k=i;
            li.add(mat[j][k]);
            while(k+1<n && j+1<m){
                li.add(mat[j+1][k+1]);
                k++;
                j++;
            }
            Collections.sort(li);
            j=0;k=i;
            mat[j][k]=li.get(j);
            while(k+1<n && j+1<m){
                mat[j+1][k+1]=li.get(j+1);
                k++;
                j++;
            }
        }
        return mat;
    }
}