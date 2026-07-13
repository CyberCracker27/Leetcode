// Last updated: 7/13/2026, 8:50:58 PM
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int s=1,e=maxi(piles);
        while(s<e ){
            int mid=(s+e)/2;
            int calh=cal(piles,mid);
            if(calh>h) s=mid+1;
            else e=mid;
        }
        return s;
        
    }
    public int maxi(int[] piles){
        int max=0;
        for(int i:piles) {
            max=Math.max(max,i);
        }
        return max;
    }
    public int cal(int[] piles,int mid){
        int c=0;
        for(int i:piles){
            // c=Math.ceil(i,mid);
            c+=(i/mid);
            if(i%mid!=0) c++;
        }
        return c;
    }
}