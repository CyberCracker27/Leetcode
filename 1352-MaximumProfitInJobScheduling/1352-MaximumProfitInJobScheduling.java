// Last updated: 7/13/2026, 8:49:57 PM
class Solution {
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int n=startTime.length;
        int[][] arr=new int[n][3];
        int[] start=new int[n];
        for(int i=0;i<n;i++){
            arr[i][0]=startTime[i];
            arr[i][1]=endTime[i];
            arr[i][2]=profit[i];
            start[i]=arr[i][0];
        }
        Arrays.sort(start);
        Arrays.sort(arr,(a,b)->a[0]-b[0]);
        int[] ans=new int[n+1];
        for(int i=n-1;i>=0;i--){
            int curr=arr[i][2];
            int end=arr[i][1];
            int after=0;
            // for(int j=i+1;j<n;i++){
            //     if(arr[j][1]>=end){
            //         after=arr[j][2];
            //         break;
            //     }else{
            //         after=0;
            //     }
            // }
            int left=i+1,right=n-1;
            int next=n;

            while(left<=right){
                int mid=(left+right)/2;

                if(start[mid]>=end){
                    next=mid;
                    right=mid-1;
                }else{
                    left=mid+1;
                }
            }

            if(next<n)
                after=ans[next];
            int a=curr+after;
            if(a<ans[i+1]){
                ans[i]=ans[i+1];
            }else{
                ans[i]=curr+after;
            }
            System.out.print(ans[i]+" ");

        }
        return ans[0];
    }
}