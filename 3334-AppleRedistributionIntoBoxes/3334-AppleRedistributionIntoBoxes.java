// Last updated: 21/01/2026, 22:08:24
class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        Arrays.sort(capacity);
        int sum=0;
        for(int i=0;i<apple.length;i++){
            sum+=apple[i];
        }
        int c=0;
        int s=0;
        for(int j=capacity.length-1;j>=0;j--){
            s+=capacity[j];
            c++;
            if(s>=sum){
                break;
            }
        }
        return c;
    }
}