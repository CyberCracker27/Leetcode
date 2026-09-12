// Last updated: 9/12/2026, 7:20:49 AM
class NeighborSum {
    int arr[][];

    public NeighborSum(int[][] grid) {
        arr=grid;
    }
    
    public int adjacentSum(int value) {
        int c=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==value){
                    if(i-1>=0){
                        c+=arr[i-1][j];
                    }
                    if(i+1<n){
                        c+=arr[i+1][j];
                    }
                    if(j+1<n){
                        c+=arr[i][j+1];
                    }
                    if(j-1>=0){
                        c+=arr[i][j-1];
                    }
                }
            }
        }
        return c;
    }
    
    public int diagonalSum(int value) {
        int c=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==value){
                    if(i-1>=0 && j-1>=0){
                        c+=arr[i-1][j-1];
                    }
                    if(i-1>=0 && j+1<n){
                        c+=arr[i-1][j+1];
                    }
                    if(i+1<n && j-1>=0){
                        c+=arr[i+1][j-1];
                    }
                    if(i+1<n && j+1<n){
                        c+=arr[i+1][j+1];
                    }
                }
            }
        }
        return c;
    }
}

/**
 * Your NeighborSum object will be instantiated and called as such:
 * NeighborSum obj = new NeighborSum(grid);
 * int param_1 = obj.adjacentSum(value);
 * int param_2 = obj.diagonalSum(value);
 */